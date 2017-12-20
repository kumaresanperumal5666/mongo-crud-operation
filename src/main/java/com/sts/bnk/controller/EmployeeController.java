package com.sts.bnk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sts.bnk.model.Employee;
import com.sts.bnk.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired EmployeeService service;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	Employee save(@RequestBody Employee emp) {
		return service.save(emp);
	}

}
