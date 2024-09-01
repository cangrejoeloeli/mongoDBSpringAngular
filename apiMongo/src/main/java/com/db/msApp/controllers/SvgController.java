package com.db.msApp.controllers;

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

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.StringWriter;
import java.io.InputStream;

@RestController
@RequestMapping("/api/svg")
public class SvgController {

    @Autowired
    private ResourceLoader resourceLoader;

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
