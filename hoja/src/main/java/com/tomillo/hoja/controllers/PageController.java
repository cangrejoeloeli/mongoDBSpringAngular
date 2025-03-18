package com.tomillo.hoja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping({ "/", "/home" })
    public String gethome(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a la Home!");
        return "home";
    }

    @GetMapping("/public")
    public String getpublic(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a la public!");
        return "public";
    }

    @GetMapping("/user")
    public String getuser(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a la user!");
        return "user";
    }

    @GetMapping("/admin")
    public String getadmin(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a la admin!");
        return "admin";
    }
}
