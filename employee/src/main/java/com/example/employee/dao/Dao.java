package com.example.employee.dao;

import com.example.employee.model.EmployeeModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Dao extends CrudRepository<EmployeeModel,Integer> {

    @Query(value = "SELECT `id`, `company`, `designamtion`, `empcode`, `name`, `password`, `phone`, `salary`, `username` FROM `employee_model` WHERE `empcode`= :empcode",nativeQuery = true)
    List<EmployeeModel> searchEmployee(Integer empcode);
}
