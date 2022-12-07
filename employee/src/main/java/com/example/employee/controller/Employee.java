package com.example.employee.controller;

import com.example.employee.dao.Dao;
import com.example.employee.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee {
    @Autowired
    private Dao dao;
    @CrossOrigin
    @PostMapping("/")
    public String WelcomePage(){
        return "Welcome Page";
    }
    @CrossOrigin
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
        dao.save(employeeModel);
        return "Add Employee Page" ;
    }
    @CrossOrigin
    @PostMapping(path = "/searchEmployee",consumes = "application/json",produces = "application/json")
    public String SearchEmployeePage(@RequestBody EmployeeModel employeeModel){
        String emp= String.valueOf(employeeModel.getEmpcode());
        System.out.println(emp);
        return "Search Employee Page";
    }
    @CrossOrigin
    @GetMapping("/viewEmployee")
    public List<EmployeeModel> ViewEmployeePage(){
        return (List<EmployeeModel>) dao.findAll();

    }

    @CrossOrigin
    @PostMapping("/editEmployee")
    public String EditEmployeePage(){
        return "Edit Employee Page";
    }

    @PostMapping("/deleteEmployee")
    public String DeleteEmployeePage(){
        return "Delete Employee Page";
    }
}
