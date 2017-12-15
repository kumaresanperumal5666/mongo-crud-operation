package com.sts.bnk.controller;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmplyeeRepo extends MongoRepository<Employee, String> {

}
