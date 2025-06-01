package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class boot {
    @RequestMapping
    public String Display(){
        return "<h1>Hello World</h1>";
    }
}
