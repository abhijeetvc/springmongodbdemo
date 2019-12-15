package com.mongodbspringdemo.springmongodbdemo.controller;

import com.mongodbspringdemo.springmongodbdemo.model.Employee;
import com.mongodbspringdemo.springmongodbdemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/saveemp")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Data saved";
    }
}
