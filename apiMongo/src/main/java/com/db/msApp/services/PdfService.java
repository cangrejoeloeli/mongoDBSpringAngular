package com.db.msApp.services;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.AreaBreakType;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.svg.converter.SvgConverter;
import com.db.msApp.services.charts.RangosChart;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.io.source.ByteArrayOutputStream;

import org.apache.batik.bridge.SVGUtilities;
import org.apache.batik.dom.GenericDOMImplementation;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.graphics2d.svg.SVGGraphics2D;
import org.jfree.graphics2d.svg.SVGUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import org.springframework.stereotype.Service;
import org.w3c.dom.DOMImplementation;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

@Service
public class PdfService {

    @Autowired
    private ResourceLoader resourceLoader;

    /**
     * Para probar graficos en SVG y los graba en pdf
     * 
     * @return
     * @throws IOException
     */
    public byte[] generarGraficosSVG() throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(byteArrayOutputStream);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument, PageSize.A4);

        /** GRAFICOS - CHARTS */
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100, "Ventas", "Enero");
        dataset.addValue(200, "Ventas", "Febrero");
        dataset.addValue(300, "Ventas", "Marzo");
        dataset.addValue(200, "Ventas", "Abril");
        dataset.addValue(350, "Ventas", "Mayo");

        JFreeChart chart = ChartFactory.createLineChart(
                "Ventas Mensuales",
                "Mes",
                "Cantidad",
                dataset);

        InputStream svgInputStream = saveChartAsSVG(chart, 1280, 1024);

        Image imgChart = SvgConverter.convertToImage(svgInputStream, pdfDocument);

        // imgChart.setFixedPosition(200, 200); // Ajusta la posición según sea
        // imgChart.setWidth(200);
        // imgChart.setHeight(200);

        document.add(imgChart);

        imgChart.setFixedPosition(00, 200); // Ajusta la posición según sea
        // imgChart.setWidth(200);
        imgChart.setHeight(200);

        document.add(imgChart);

        RangosChart rangosChart = new RangosChart();
        JFreeChart rangos = rangosChart.createRangosChart();
        InputStream rangosStream = saveChartAsSVG(rangos, 1280, 1024);
        Image rangosImage = SvgConverter.convertToImage(rangosStream, pdfDocument);
        document.add(rangosImage);

        // Obtener los recursos SVG desde el directorio /resources/static
        Resource blanco = resourceLoader.getResource("classpath:static/svgs/blanco.svg");
        Resource balazo = resourceLoader.getResource("classpath:static/svgs/bullet.svg");

        // Leer archivos SVG desde el sistema de archivos
        try (InputStream svgInputStreamBlanco = blanco.getInputStream();
                InputStream svgInputStreamBalazo = balazo.getInputStream()) {

            // Convertir SVG a Image utilizando SvgConverter
            Image imgBlanco = SvgConverter.convertToImage(svgInputStreamBlanco, pdfDocument);
            Image imgBalazo = SvgConverter.convertToImage(svgInputStreamBalazo, pdfDocument);

            // Superponer imágenes (se pueden ajustar posiciones)
            imgBlanco.setFixedPosition(100, 100); // Ajusta la posición según sea
                                                  // necesario
            imgBalazo.setFixedPosition(200, 200); // Ajusta la posición según sea
                                                  // necesario
            imgBlanco.setWidth(200);
            imgBlanco.setHeight(200);
            imgBalazo.setWidth(10);
            imgBalazo.setHeight(10);
            document.add(imgBlanco);
            document.add(imgBalazo);

        }

        /** END CHARTS */
        // Agregar texto adicional si es necesario
        document.add(new Paragraph("Gráfico generado en formato SVG."));
        // Crear una tabla con 3 columnas
        float[] columnWidths = { 200F, 400F };
        Table table = new Table(columnWidths);

        // table.setBackgroundColor(ColorConstants.WHITE);
        for (int i = 0; i < 20; i++) {
            table.addCell("Celda " + String.valueOf(i)).setBackgroundColor(ColorConstants.WHITE);
        }

        document.add(table);

        document.close();

        return byteArrayOutputStream.toByteArray();
    }

    /**
     * Auxiliar para convertir el JFreeChart en SVG InputStream
     * 
     * @param chart
     * @param width
     * @param height
     * @return
     */
    private static InputStream saveChartAsSVG(JFreeChart chart, int width, int height) {
        try {
            SVGGraphics2D svgGraphics = new SVGGraphics2D(width, height);
            chart.draw(svgGraphics, new java.awt.Rectangle(width, height));
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            String svgElement = svgGraphics.getSVGElement();
            try (StringWriter writer = new StringWriter()) {
                writer.write(svgElement);
                outputStream.write(writer.toString().getBytes("UTF-8"));
            }
            return new ByteArrayInputStream(outputStream.toByteArray());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Para probar graficos
     * 
     * @return
     * @throws IOException
     */
    public byte[] generarGraficosPNG() throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(byteArrayOutputStream);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument, PageSize.A4);

        /** GRAFICOS - CHARTS */
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(100, "Ventas", "Enero");
        dataset.addValue(200, "Ventas", "Febrero");
        dataset.addValue(300, "Ventas", "Marzo");
        dataset.addValue(200, "Ventas", "Abril");
        dataset.addValue(350, "Ventas", "Mayo");

        JFreeChart chart = ChartFactory.createLineChart("Ventas Mensuales", "Mes", "Cantidad", dataset);
        ByteArrayOutputStream chartOut = new ByteArrayOutputStream();

        ChartUtils.writeChartAsPNG(chartOut, chart, 1024, 768);
        // ChartUtils.writeScaledChartAsPNG(chartOut, chart, 640, 480, 1, 1);

        byte[] chartBytes = chartOut.toByteArray();

        // Insertar el gráfico como imagen en el PDF
        ImageData imageData = ImageDataFactory.create(chartBytes);
        Image chartImage = new Image(imageData);

        // Superponer imágenes (se pueden ajustar posiciones)
        chartImage.setFixedPosition(100, 100); // Ajusta la posición según sea
        chartImage.setWidth(200);
        chartImage.setHeight(200);

        document.add(chartImage);

        /** END CHARTS */

        // Crear una tabla con 3 columnas
        float[] columnWidths = { 200F, 400F };
        Table table = new Table(columnWidths);

        // Añadir celdas a la tabla
        table.addHeaderCell("Encabezado ").setBackgroundColor(ColorConstants.LIGHT_GRAY);
        table.addHeaderCell("Te amo iText!").setBackgroundColor(ColorConstants.LIGHT_GRAY);
        table.addHeaderCell("Pah  que si Te amo iText!").setBackgroundColor(ColorConstants.LIGHT_GRAY);
        table.addHeaderCell("Columna 2!").setBackgroundColor(ColorConstants.LIGHT_GRAY);

        // table.setBackgroundColor(ColorConstants.WHITE);
        for (int i = 0; i < 20; i++) {
            table.addCell("Celda " + String.valueOf(i)).setBackgroundColor(ColorConstants.WHITE);
        }

        document.add(table);

        document.close();

        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generarPaginas() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(byteArrayOutputStream);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument, PageSize.A4);

        pdfDocument.addEventHandler(PdfDocumentEvent.END_PAGE, new NewPageHandler());

        // int pageNumber = pdfDocument.getPageNumber(page);
        int totalPageCount = pdfDocument.getNumberOfPages();

        document.add(new Paragraph("Inicio del doc #" + String.valueOf(pdfDocument.getNumberOfPages())));
        document.add(new Paragraph("1 de " + String.valueOf(pdfDocument.getNumberOfPages())));

        // Crear una tabla con 3 columnas
        float[] columnWidths = { 200F, 400F };
        Table table = new Table(columnWidths);

        // Añadir celdas a la tabla
        table.addHeaderCell("Encabezado ").setBackgroundColor(ColorConstants.LIGHT_GRAY);
        table.addHeaderCell("Te amo iText!").setBackgroundColor(ColorConstants.LIGHT_GRAY);

        // table.setBackgroundColor(ColorConstants.WHITE);
        for (int i = 0; i < 200; i++) {
            table.addCell("Celda " + String.valueOf(i)).setBackgroundColor(ColorConstants.WHITE);
        }

        document.add(table);

        // página 2
        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));

        document.add(new Paragraph("2 de " + String.valueOf(pdfDocument.getNumberOfPages())));

        // página 3
        document.add(new AreaBreak(AreaBreakType.NEXT_PAGE));

        document.add(new Paragraph("3 de " + String.valueOf(pdfDocument.getNumberOfPages())));

        document.close();

        // abro de nuevo el archivo que cerré recién para numerar las páginas.
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        PdfReader rd = new PdfReader(byteArrayInputStream);
        PdfWriter wr = new PdfWriter(byteArrayOutputStream);
        PdfDocument pDoc = new PdfDocument(rd, wr);

        Document doc = new Document(pDoc);

        int numberOfPages = pDoc.getNumberOfPages();
        for (int i = 1; i <= numberOfPages; i++) {

            // Write aligned text to the specified by parameters point
            doc.showTextAligned(
                    new Paragraph(String.format("Página %s of %s", i, numberOfPages)).setFontColor(ColorConstants.BLUE),
                    559, 806, i, TextAlignment.RIGHT, VerticalAlignment.TOP, 0);
        }

        doc.close();

        return byteArrayOutputStream.toByteArray();
    }

    public byte[] generatePdf() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PdfWriter writer = new PdfWriter(byteArrayOutputStream);
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument, PageSize.A4);

        // Obtener las dimensiones de la página A4
        float pageWidth = PageSize.A4.getWidth();
        float pageHeight = PageSize.A4.getHeight();

        // PdfCanvas canvas = new PdfCanvas(pdfDocument.addNewPage())
        // .setStrokeColor(ColorConstants.BLACK)
        // .setFillColor(ColorConstants.GRAY)
        // .roundRectangle(100, 100, 100, 100, 10)
        // .fill()
        // .rectangle(100, 210, 100, 100)
        // .fill()
        // .setFillColor(ColorConstants.WHITE)
        // .setLineWidth(0)
        // .roundRectangle(210, 100, 100, 100, 10)
        // .stroke()
        // .rectangle(210, 210, 100, 100)
        // .stroke();

        // Obtener los recursos SVG desde el directorio /resources/static
        Resource blanco = resourceLoader.getResource("classpath:static/svgs/blanco.svg");
        Resource balazo = resourceLoader.getResource("classpath:static/svgs/bullet.svg");

        // Leer archivos SVG desde el sistema de archivos
        try (InputStream svgInputStreamBlanco = blanco.getInputStream();
                InputStream svgInputStreamBalazo = balazo.getInputStream()) {

            // Convertir SVG a Image utilizando SvgConverter
            Image imgBlanco = SvgConverter.convertToImage(svgInputStreamBlanco, pdfDocument);
            Image imgBalazo = SvgConverter.convertToImage(svgInputStreamBalazo, pdfDocument);

            // Superponer imágenes (se pueden ajustar posiciones)
            imgBlanco.setFixedPosition(100, 100); // Ajusta la posición según sea
                                                  // necesario
            imgBalazo.setFixedPosition(200, 200); // Ajusta la posición según sea
                                                  // necesario
            imgBlanco.setWidth(200);
            imgBlanco.setHeight(200);
            imgBalazo.setWidth(10);
            imgBalazo.setHeight(10);
            document.add(imgBlanco);
            document.add(imgBalazo);

            // Compose Paragraph

            // Paragraph p = new Paragraph("The quick brown ")
            // .add(imgBlanco)
            // .add(" jumps over the lazy ")
            // .add(imgBalazo);
            // // Add Paragraph to document
            // document.add(p);
        }

        // Agregar texto
        Paragraph paragraph = new Paragraph("Este es un texto en la primera página.");
        document.add(paragraph);

        // Agregar texto
        Paragraph dim = new Paragraph(
                "Dimensiones son: " + "Ancho:" + String.valueOf(pageWidth) + "- Alto:" + String.valueOf(pageHeight));
        document.add(dim);

        // Crear una tabla con 3 columnas
        float[] columnWidths = { 1, 2, 1 }; // Anchos relativos de las columnas
        Table table = new Table(columnWidths);

        // Agregar encabezados
        table.addHeaderCell(new Cell().add(new Paragraph("Columna 1").setTextAlignment(TextAlignment.CENTER)));
        table.addHeaderCell(new Cell().add(new Paragraph("Columna 2").setTextAlignment(TextAlignment.CENTER)));
        table.addHeaderCell(new Cell().add(new Paragraph("Columna 3").setTextAlignment(TextAlignment.CENTER)));

        // Agregar filas a la tabla
        for (int i = 1; i <= 5; i++) {
            table.addCell(new Cell().add(new Paragraph("Fila " + i + ", Col 1")));
            table.addCell(new Cell().add(new Paragraph("Fila " + i + ", Col 2")));
            table.addCell(new Cell().add(new Paragraph("Fila " + i + ", Col 3")));
        }

        // Agregar la tabla al documento
        document.add(table);

        // Create a PdfFont
        PdfFont font = PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
        // Add a Paragraph
        document.add(new Paragraph("iText is:").setFont(font));
        // Create a List
        List list = new List()
                .setSymbolIndent(12)
                .setListSymbol("\u2022")
                .setFont(font);
        // Add ListItem objects
        list.add(new ListItem("Never gonna give you up"))
                .add(new ListItem("Never gonna let you down"))
                .add(new ListItem("Never gonna run around and desert you"))
                .add(new ListItem("Never gonna make you cry"))
                .add(new ListItem("Never gonna say goodbye"))
                .add(new ListItem("Never gonna tell a lie and hurt you"));
        // Add the list
        document.add(list);

        document.close();
        return byteArrayOutputStream.toByteArray();
    }

}
