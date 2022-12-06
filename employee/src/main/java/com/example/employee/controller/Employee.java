package com.example.employee.controller;

import com.example.employee.model.EmployeeModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee {
    @PostMapping("/")
    public String WelcomePage(){
        return "Welcome Page";
    }

    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public String AddEmployeePage(@RequestBody EmployeeModel employeeModel){
        System.out.println(
                "Emp Code "+employeeModel.getEmpcode()+"\n"+
                        "Name "+ employeeModel.getName()+"\n" +
                        "Designation "+  employeeModel.getDesignamtion()+"\n" +
                        "Salary "+  employeeModel.getSalary()+"\n" +
                        "Company "+  employeeModel.getCompany()+"\n" +
                        "Phone "+  employeeModel.getPhone()+"\n" +
                        "Username "+  employeeModel.getUsername()+"\n" +
                        "Password "+  employeeModel.getPassword()+"\n"
        );
        return "Add Employee Page" ;
    }

    @PostMapping("/searchEmployee")
    public String SearchEmployeePage(){
        return "Search Employee Page";
    }

    @GetMapping("/viewEmployee")
    public List<EmployeeModel> ViewEmployeePage(){
        return (List<EmployeeModel>)

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
