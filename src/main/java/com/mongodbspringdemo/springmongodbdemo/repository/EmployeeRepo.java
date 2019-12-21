package com.mongodbspringdemo.springmongodbdemo.repository;

import com.mongodbspringdemo.springmongodbdemo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface EmployeeRepo extends MongoRepository<Employee,String> {

    @Query(value="{{name:?0,city:?1}",fields = "{name:1,city:1}")
    Optional<Employee> findById(String id,String name);
}
