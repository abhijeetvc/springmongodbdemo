package com.mongodbspringdemo.springmongodbdemo.repository;

import com.mongodbspringdemo.springmongodbdemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepo extends MongoRepository<Employee,String> {
}
