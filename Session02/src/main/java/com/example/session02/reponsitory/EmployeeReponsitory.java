package com.example.session02.reponsitory;

import com.example.session02.model.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeReponsitory {
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeReponsitory() {
        employees.add(new Employee(1L,"Nguyễn Văn A","a@gmail.com","IT"));
        employees.add(new Employee(2L,"Trần Thị B","b@gmail.com","HR"));
        employees.add(new Employee(3L,"Lê Văn C","c@gmail.com","Marketing"));
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }
}
