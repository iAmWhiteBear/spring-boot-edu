package com.gumen.springbootedu.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/")
public class mainController {


    @GetMapping("/index")
    public String showIndex(){
        return "index";
    }
}
