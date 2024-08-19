package com.db.msApp.services;

import java.io.IOException;

import com.itextpdf.kernel.events.Event;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;

public class NewPageHandler implements IEventHandler {

    @Override
    public void handleEvent(Event event) {
        System.err.println(event.toString());
        PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
        PdfDocument pdfDoc = docEvent.getDocument();
        PdfPage page = docEvent.getPage();
        int pageNumber = pdfDoc.getPageNumber(page);

        PdfCanvas pdfCanvas = new PdfCanvas(page.newContentStreamBefore(), page.getResources(), pdfDoc);
        pdfCanvas.beginText();
        try {
            pdfCanvas.setFontAndSize(PdfFontFactory.createFont(),
                    12);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Colocar el número de página en el pie de página
        String pageText = String.format("Página %d", pageNumber);
        pdfCanvas.moveText((page.getPageSize().getWidth() / 2) - 60, 20);
        pdfCanvas.showText(pageText);
        pdfCanvas.endText();
        pdfCanvas.release();
    }

}
