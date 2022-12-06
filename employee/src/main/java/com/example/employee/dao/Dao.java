package com.example.employee.dao;

import com.example.employee.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface Dao extends CrudRepository<EmployeeModel,Integer> {
}
