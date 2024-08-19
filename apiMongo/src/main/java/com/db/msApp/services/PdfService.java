package com.db.msApp.services;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfResources;
import com.itextpdf.kernel.pdf.PdfStream;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.AreaBreakType;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.TransparentColor;
import com.itextpdf.layout.properties.UnitValue;
import com.itextpdf.layout.properties.VerticalAlignment;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.svg.converter.SvgConverter;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.io.source.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class PdfService {

    @Autowired
    private ResourceLoader resourceLoader;

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
