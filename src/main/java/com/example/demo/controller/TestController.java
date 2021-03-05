package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("add/{num1}/{num2}")
    public int add(@PathVariable("num1")Integer a, @PathVariable("num2")Integer b){
        return a+b;
    }

    @GetMapping("/test")
    public String testMethod(){
        return "Hello";
    }
}
