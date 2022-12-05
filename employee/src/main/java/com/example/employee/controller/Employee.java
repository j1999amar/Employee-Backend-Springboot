package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
    @GetMapping("/")
    public String WelcomePage(){
        return "Welcome Page";
    }
}
