package com.example.springbootwebapi.controller;

import com.example.springbootwebapi.model.Employee;
import com.example.springbootwebapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/employees/hello")
    public String saySomething()
    {
        return "I am learning spring boot";
    }

    @GetMapping("/employees/defaultEmployee")
    public Employee getDefaultEmployee()
    {
        Employee e = new Employee(1, UUID.randomUUID().toString(), "john","doe");
        return e;
    }

    @GetMapping("/employees/{uuid}")
    public Employee getEmployeeByUid(@PathVariable("uuid") String uid)
    {
        return employeeRepository.selectByUid(uid);
    }
}
