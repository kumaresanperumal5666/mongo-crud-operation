package com.sts.bnk.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sts.bnk.model.Employee;



public interface EmpRepo extends MongoRepository<Employee, String>{

}
