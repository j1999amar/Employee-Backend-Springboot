package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
    @GetMapping("/")
    public String WelcomePage(){
        return "Welcome Page";
    }

    @GetMapping("/addEmployee")
    public String AddEmployeePage(){
        return "Add Employee Page";
    }

    @GetMapping("/searchEmployee")
    public String SearchEmployeePage(){
        return "Search Employee Page";
    }
}
