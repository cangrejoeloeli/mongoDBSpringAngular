package com.db.msApp.controllers;

import org.apache.batik.anim.dom.SVGDOMImplementation;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.util.SAXDocumentFactory;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.util.XMLResourceDescriptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;

import com.db.msApp.math.MathService;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.awt.Polygon;

import java.io.StringWriter;
import java.io.InputStream;

@RestController
@RequestMapping("/api/svg")
public class SvgController {

    @Autowired
    private ResourceLoader resourceLoader;

    @GetMapping("/hull")
    public ResponseEntity<String> getSvgHull() throws IOException {
        String svgString = "";
        try {

            // Obtener una instancia de DOMImplementation
            DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();

            // Crear un documento SVG
            String svgNS = "http://www.w3.org/2000/svg";
            Document document = domImpl.createDocument(svgNS, "svg", null);

            // Crear un objeto SVGGraphics2D
            SVGGraphics2D svgGenerator = new SVGGraphics2D(document);

            int mainRect = 400;
            int radio = 40;
            svgGenerator.drawRect(0, 0, mainRect, mainRect);

            // Dibujar un círculo en el objeto SVGGraphics2D
            Element circle = document.createElementNS(svgNS, "circle");
            circle.setAttributeNS(null, "cx", String.valueOf(mainRect / 2));
            circle.setAttributeNS(null, "cy", String.valueOf(mainRect / 2));
            circle.setAttributeNS(null, "r", String.valueOf(radio));
            circle.setAttributeNS(null, "stroke", "black");
            circle.setAttributeNS(null, "stroke-width", "2");
            circle.setAttributeNS(null, "fill", "red");
            document.getDocumentElement().appendChild(circle);

            Element diag1 = document.createElementNS(svgNS, "line");
            diag1.setAttributeNS(null, "x1", "0");
            diag1.setAttributeNS(null, "y1", "0");
            diag1.setAttributeNS(null, "x2", String.valueOf(mainRect));
            diag1.setAttributeNS(null, "y2", String.valueOf(mainRect));
            diag1.setAttributeNS(null, "stroke", "green");
            document.getDocumentElement().appendChild(diag1);

            Element diag2 = document.createElementNS(svgNS, "line");
            diag2.setAttributeNS(null, "x2", String.valueOf(mainRect));
            diag2.setAttributeNS(null, "y1", String.valueOf(mainRect));
            diag2.setAttributeNS(null, "x1", "0");
            diag2.setAttributeNS(null, "y2", "0");

            diag2.setAttributeNS(null, "stroke", "green");
            document.getDocumentElement().appendChild(diag2);

            // poligon
            Element polygon = document.createElementNS("http://www.w3.org/2000/svg", "polygon");
            polygon.setAttributeNS(null, "points", "50,130 50,150 150,150 100,50");
            polygon.setAttributeNS(null, "style", "fill:lime;stroke:yellow;stroke-width:1;fill-opacity:0.3");
            document.getDocumentElement().appendChild(polygon);

            // Definir los puntos del polígono
            int[] xPoints = { 10, 200, 250, 200 };
            int[] yPoints = { 50, 10, 50, 90 };
            int nPoints = 4;

            // Dibujar el polígono en el objeto SVGGraphics2D
            Polygon polygon1 = new Polygon(xPoints, yPoints, nPoints);
            svgGenerator.drawPolygon(polygon1);

            document.getDocumentElement().appendChild(svgGenerator.getRoot());

            // Convertir el contenido SVG a una cadena
            boolean useCSS = true;
            StringWriter stringWriter = new StringWriter();
            try {
                svgGenerator.stream(document.getDocumentElement(), stringWriter, useCSS, true);

            } catch (Exception e) {
                e.printStackTrace();
            }

            // Obtener el SVG como cadena
            svgString = stringWriter.toString();

        } catch (Exception e) {

        }
        // encabezados para svg
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/svg+xml");
        return new ResponseEntity<>(svgString, headers, HttpStatus.OK);
    }

    @GetMapping(value = "/bezier")
    public ResponseEntity<String> getSvgBezier()
            throws IOException, TransformerFactoryConfigurationError, TransformerException {
        // Create an SVG document using Batik
        DOMImplementation domImpl = SVGDOMImplementation.getDOMImplementation();
        String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
        Document document = domImpl.createDocument(svgNS, "svg", null);

        // Direct DOM manipulation to create the path element
        Element svgRoot = document.getDocumentElement();
        svgRoot.setAttribute("width", "500");
        svgRoot.setAttribute("height", "500");

        // The provided points
        float[][] points = {
                { -0.0064f, -0.0503f },
                { -0.0033f, -0.0418f },
                { -0.0017f, -0.0352f },
                { 0.0013f, -0.0266f },
                { 0.0041f, -0.0223f },
                { 0.0015f, -0.0179f },
                { 0.0071f, -0.0137f },
                { 0.0000f, 0.0000f },
                { -0.3245f, -0.3738f },
                { -0.3029f, -0.9027f },
                { -0.5010f, 0.0973f },
                { -0.4869f, 0.4197f },
                { -0.4006f, 0.3659f },
                { -0.2180f, 0.4484f },
                { -0.2995f, 0.0573f },
                { -0.3065f, -0.2958f },
                { -0.3660f, -0.4431f },
                { -0.3658f, -0.3684f },
                { -0.3062f, -0.1694f },
                { -0.2400f, -0.0121f }
        };

        // Scaling and translating the points to fit into the SVG space
        float scale = 1000; // Scaling factor to make points more visible
        float translateX = 250; // Translate to fit into SVG viewport
        float translateY = 250;

        // Create and append the spline (Bezier curve) as a path
        Element pathElement = createSplinePath(document, points, scale, translateX, translateY);
        svgRoot.appendChild(pathElement);

        // Convert the final SVG document to a string
        String svgString = getSVGAsString(document);

        // encabezados para svg
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/svg+xml");
        return new ResponseEntity<>(svgString, headers, HttpStatus.OK);
    }

    // Function to create a spline path element directly in the DOM
    private static Element createSplinePath(Document document, float[][] points, float scale, float translateX,
            float translateY) {
        // Create a path element
        String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
        Element path = document.createElementNS(svgNS, "path");

        // Build the path data string for a cubic Bezier curve
        StringBuilder pathData = new StringBuilder();

        // Move to the first point
        float x = points[0][0] * scale + translateX;
        float y = points[0][1] * scale + translateY;
        pathData.append("M ").append(x).append(" ").append(y).append(" ");

        // Iterate over points and create cubic Bezier segments
        for (int i = 1; i < points.length - 2; i += 3) {
            float x1 = points[i][0] * scale + translateX;
            float y1 = points[i][1] * scale + translateY;
            float x2 = points[i + 1][0] * scale + translateX;
            float y2 = points[i + 1][1] * scale + translateY;
            float x3 = points[i + 2][0] * scale + translateX;
            float y3 = points[i + 2][1] * scale + translateY;
            pathData.append("C ")
                    .append(x1).append(" ").append(y1).append(", ")
                    .append(x2).append(" ").append(y2).append(", ")
                    .append(x3).append(" ").append(y3).append(" ");
        }

        // Set the path data
        path.setAttributeNS(null, "d", pathData.toString());
        path.setAttributeNS(null, "stroke", "black");
        path.setAttributeNS(null, "fill", "none");

        return path; // Return the path element
    }

    // Function to convert the SVG document to a string
    private static String getSVGAsString(Document document)
            throws IOException, TransformerFactoryConfigurationError, TransformerException {
        /* Creo el objeto para transformar */
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);

        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        transformer.transform(source, result);

        return writer.toString(); // Return the string
    }

    @GetMapping(value = "/new")
    public ResponseEntity<String> getSvgImage() throws IOException {

        String respuesta = "";
        // Obtiene recursos
        Resource blanco = resourceLoader.getResource("classpath:static/svgs/blanco.svg");
        Resource balazo = resourceLoader.getResource("classpath:static/svgs/bullet.svg");
        // convierte a String
        String svgBlanco = blanco.getContentAsString(StandardCharsets.UTF_8);
        String svgBalazo = balazo.getContentAsString(StandardCharsets.UTF_8);
        // a input stream
        InputStream inpstBlanco = blanco.getInputStream();
        InputStream inpsBalazo = balazo.getInputStream();

        String parser = XMLResourceDescriptor.getXMLParserClassName();
        DOMImplementationRegistry registry;
        try {
            registry = DOMImplementationRegistry.newInstance();
            DOMImplementation domImplementation = registry.getDOMImplementation("XML 1.0");
            SAXDocumentFactory factory = new SAXDocumentFactory(domImplementation, parser);

            Document docBlanco = factory.createDocument(null, inpstBlanco);
            Document docBalazo = factory.createDocument(null, inpsBalazo);

            Element rootBlanco = docBlanco.getDocumentElement();
            Element rootBalazo = (Element) docBlanco.importNode(docBalazo.getDocumentElement(), true);

            for (int i = 1; i < 6; i++) {
                Element group = docBlanco.createElementNS("http://www.w3.org/2000/svg", "g");
                group.setAttribute("transform",
                        "translate(" + String.valueOf(i * 20) + ", " + String.valueOf(i * 30) + ") scale(0.4)");
                group.appendChild(rootBalazo.cloneNode(true));
                rootBlanco.appendChild(group);
                Element text = docBlanco.createElementNS("http://www.w3.org/2000/svg", "text");
                text.setAttribute("x", String.valueOf(i * 20));
                text.setAttribute("y", String.valueOf(i * 30));
                text.setAttribute("font-family", "Arial");
                text.setAttribute("font-size", "10");
                text.setAttribute("fill", "red");
                text.setTextContent(String.valueOf(i));
                rootBlanco.appendChild(text);
            }

            Element line1 = docBlanco.createElementNS("http://www.w3.org/2000/svg", "line");
            line1.setAttributeNS(null, "x1", "10");
            line1.setAttributeNS(null, "y1", "10");
            line1.setAttributeNS(null, "x2", "200");
            line1.setAttributeNS(null, "y2", "200");
            line1.setAttributeNS(null, "stroke", "green");
            rootBlanco.appendChild(line1);
            // SVGGraphics2D svgGraphics2D = new SVGGraphics2D(docBlanco);
            // svgGraphics2D.drawLine(10, 10, 160, 10);

            // poligon
            Element polygon = docBlanco.createElementNS("http://www.w3.org/2000/svg", "polygon");
            polygon.setAttributeNS(null, "points", "50,130 50,150 150,150 100,50");
            polygon.setAttributeNS(null, "style", "fill:lime;stroke:yellow;stroke-width:1;fill-opacity:0.3");
            rootBlanco.appendChild(polygon);

            // Create a new circle element
            Element circle = docBlanco.createElementNS("http://www.w3.org/2000/svg", "circle");
            circle.setAttributeNS(null, "cx", "140"); // x-axis center
            circle.setAttributeNS(null, "cy", "40"); // y-axis center
            circle.setAttributeNS(null, "r", "10"); // radius
            circle.setAttributeNS(null, "style", "fill:blue;stroke:black;stroke-width:2;fill-opacity:0.5");
            rootBlanco.appendChild(circle);

            // regla
            // Create a new rectangle element
            Element rectangle = docBlanco.createElementNS("http://www.w3.org/2000/svg", "rect");
            rectangle.setAttributeNS(null, "x", "10");
            rectangle.setAttributeNS(null, "y", "10");
            rectangle.setAttributeNS(null, "width", "300");
            rectangle.setAttributeNS(null, "height", "50");
            rectangle.setAttributeNS(null, "style", "fill:none;stroke:black;stroke-width:2");

            // Append the rectangle to the root element
            docBlanco.getDocumentElement().appendChild(rectangle);

            // Add measurement lines and text
            for (int i = 0; i <= 300; i += 10) {
                Element line = docBlanco.createElementNS("http://www.w3.org/2000/svg", "line");
                line.setAttributeNS(null, "x1", String.valueOf(10 + i));
                line.setAttributeNS(null, "y1", "10");
                line.setAttributeNS(null, "x2", String.valueOf(10 + i));
                line.setAttributeNS(null, "y2", i % 50 == 0 ? "0" : "5");
                line.setAttributeNS(null, "stroke", "black");
                docBlanco.getDocumentElement().appendChild(line);

                if (i % 50 == 0) {
                    Element text = docBlanco.createElementNS("http://www.w3.org/2000/svg", "text");
                    text.setAttributeNS(null, "x", String.valueOf(10 + i));
                    text.setAttributeNS(null, "y", "25");
                    text.setAttributeNS(null, "font-size", "8");
                    text.setAttributeNS(null, "text-anchor", "middle");
                    text.setTextContent(String.valueOf(i));
                    docBlanco.getDocumentElement().appendChild(text);
                }
            }

            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            DOMSource source = new DOMSource(docBlanco);
            StringWriter stringWriter = new StringWriter();
            StreamResult result = new StreamResult(stringWriter);
            transformer.transform(source, result);

            respuesta = stringWriter.toString();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ClassCastException
                | TransformerFactoryConfigurationError | TransformerException e) {

            e.printStackTrace();
        }

        MathService servicio = new MathService();
        servicio.UsarFuncion();

        // String svg = "<svg width=\"100\" height=\"100\"
        // xmlns=\"http://www.w3.org/2000/svg\">" +
        // "<circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"black\" stroke-width=\"3\"
        // fill=\"red\" />" +
        // "</svg>";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/svg+xml");

        return new ResponseEntity<>(respuesta, headers, HttpStatus.OK);
    }

    //// CONVEX HULL
    /*
     * 
     * public static void main(String[] args) {
     * Point[] points = {new Point(0, 3), new Point(2, 2), new Point(1, 1), new
     * Point(2, 1),
     * new Point(3, 0), new Point(0, 0), new Point(3, 3)};
     * List<Point> hull = convexHull(points);
     * 
     * System.out.println("Convex Hull:");
     * for (Point p : hull) {
     * System.out.println("(" + p.x + ", " + p.y + ")");
     * }
     * }
     * }
     * 
     * 
     */

}
