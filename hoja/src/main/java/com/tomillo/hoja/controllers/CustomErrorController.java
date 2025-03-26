package com.tomillo.hoja.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(PATH)
    public String requestMethodName(HttpServletRequest request, Model model) {

        String originalUri = (String) request.getAttribute("javax.servlet.error.request_uri");

        model.addAttribute("message", "No se encontró la página " + originalUri);
        return "error";
    }

}
