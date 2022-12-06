package com.example.employee.dao;

import com.example.employee.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface dao extends CrudRepository<EmployeeModel,Integer> {
}
