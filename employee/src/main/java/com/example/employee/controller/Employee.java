package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
    @PostMapping("/")
    public String WelcomePage(){
        return "Welcome Page";
    }

    @PostMapping("/addEmployee")
    public String AddEmployeePage(){
        return "Add Employee Page";
    }

    @PostMapping("/searchEmployee")
    public String SearchEmployeePage(){
        return "Search Employee Page";
    }

    @GetMapping("/viewEmployee")
    public String ViewEmployeePage(){
        return "View Employee Page";
    }

    @PostMapping("/editEmployee")
    public String EditEmployeePage(){
        return "Edit Employee Page";
    }

    @PostMapping("/deleteEmployee")
    public String DeleteEmployeePage(){
        return "Delete Employee Page";
    }
}
