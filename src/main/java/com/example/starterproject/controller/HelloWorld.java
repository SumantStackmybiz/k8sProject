package com.example.starterproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {

    @GetMapping("/api/v1/h1")

    public String print(){
        String string = "Hello world !";
        return string;
    }
}
