package com.belous.springboot.jpacrudrest.service;

import com.belous.springboot.jpacrudrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);
}
