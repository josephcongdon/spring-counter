package com.example.springcounter.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CounterController {



    @GetMapping("")
    @ResponseBody
    public String home() {
        return "home/home";
    }

}

