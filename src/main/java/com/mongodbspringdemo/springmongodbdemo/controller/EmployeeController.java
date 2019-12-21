package com.mongodbspringdemo.springmongodbdemo.controller;

import com.mongodbspringdemo.springmongodbdemo.model.Employee;
import com.mongodbspringdemo.springmongodbdemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/saveemp")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "Data saved";
    }

    @GetMapping(value="/getallemp")
    public List<Employee> getEmpl(){
        return employeeRepo.findAll();
    }

    @GetMapping(value="/getempbyid/{id}")
    public Optional<Employee> getEmplById(@PathVariable String id){
        return employeeRepo.findById(id);
    }
}
