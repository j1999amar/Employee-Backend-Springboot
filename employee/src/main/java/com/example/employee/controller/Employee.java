package com.example.employee.controller;

import com.example.employee.model.EmployeeModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class Employee {
    @PostMapping("/")
    public String WelcomePage(){
        return "Welcome Page";
    }

    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public String AddEmployeePage(@RequestBody EmployeeModel employeeModel){
        System.out.println(employeeModel.getName()+
                employeeModel.getDesignamtion()+
               employeeModel.getSalary()+
               employeeModel.getCompany()+
                employeeModel.getPhone()+
                employeeModel.getUsername()+
                employeeModel.getPassword());
        return "Add Employee Page" ;
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
