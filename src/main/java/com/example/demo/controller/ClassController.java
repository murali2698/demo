package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    @GetMapping("/")
    public String getHello(){
        System.out.println("Hello world");
        return "Hello world... this is maven learning the world";
    }
}
