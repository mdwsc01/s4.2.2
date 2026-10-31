package com.example.session02.service;

import com.example.session02.model.entity.Employee;
import com.example.session02.reponsitory.EmployeeReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeReponsitory employeeReponsitory;

    @Autowired
    public EmployeeService(EmployeeReponsitory employeeReponsitory) {
        this.employeeReponsitory = employeeReponsitory;
    }

    public List<Employee> getAllEmployees() {
        return employeeReponsitory.findAll();
    }
}
