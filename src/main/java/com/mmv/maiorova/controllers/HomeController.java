package com.mmv.maiorova.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String newPage(Model model) {
        model.addAttribute("title", "Home Page");
        return "home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Home Page");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Home Page");
        return "about";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("title", "Home Page");
        return "blog";
    }

}
