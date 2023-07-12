package com.testcontainer.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Heloo {
    
    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
