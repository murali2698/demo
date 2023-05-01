package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ClassController {

    @GetMapping("/")
    public String getHello() {
        log.info("Hello world");
        return "Hello world... this is maven learning the world";
    }
}
