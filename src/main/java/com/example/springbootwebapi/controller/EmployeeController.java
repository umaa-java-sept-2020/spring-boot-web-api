package com.example.springbootwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees/hello")
    public String saySomething()
    {
        return "I am learning spring boot";
    }
}
