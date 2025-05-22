package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello")
    public String getHello() {
        return "Hello1";
    }

    @GetMapping("hello2")
    public String getHello2() {
        return "Hello2";
    }
}