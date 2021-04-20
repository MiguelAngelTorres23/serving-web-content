package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerForm {
    @PostMapping("/formulariospring")
    public String form(String name,String contrasenya,Model model){
        model.addAttribute("name", name);
        model.addAttribute("contrasenya", contrasenya);
        return "RPeticiones";
    }
    @GetMapping("/formulariospring")
    public String postForm(String personName,String contrasenya,Model model){
        return "formulariosMiguel";
    }
}