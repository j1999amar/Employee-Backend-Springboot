package com.example.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class EmployeeModel {
    @Id
    @GeneratedValue
    private int id;
    private int empcode;



    private String name;
    private String designamtion;
    private int salary;
    private String company;
    private String phone;
    private String username;
    private String password;

    public EmployeeModel() {
    }

    public EmployeeModel(int id,int empcode, String name, String designamtion, int salary, String company, String phone, String username, String password) {
        this.id=id;
        this.empcode = empcode;
        this.name = name;
        this.designamtion = designamtion;
        this.salary = salary;
        this.company = company;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignamtion() {
        return designamtion;
    }

    public void setDesignamtion(String designamtion) {
        this.designamtion = designamtion;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
