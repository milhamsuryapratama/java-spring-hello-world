package com.javspring.project.demo;

import com.javspring.project.demo.model.FormModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("greeting", "Halo World");
        return "index";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/form")
    public String formSubmit(FormModel formModel, Model model) {
        model.addAttribute(model);
        return "form";
    }
}
