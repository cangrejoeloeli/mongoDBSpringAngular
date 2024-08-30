package com.db.msApp.controllers;

import org.apache.batik.dom.util.SAXDocumentFactory;
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

        // String svg = "<svg width=\"100\" height=\"100\"
        // xmlns=\"http://www.w3.org/2000/svg\">" +
        // "<circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"black\" stroke-width=\"3\"
        // fill=\"red\" />" +
        // "</svg>";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "image/svg+xml");

        return new ResponseEntity<>(respuesta, headers, HttpStatus.OK);
    }

}
