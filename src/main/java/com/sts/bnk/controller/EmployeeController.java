package com.sts.bnk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sts.bnk.model.Employee;
import com.sts.bnk.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	Employee save(@RequestBody Employee emp) {
		return service.save(emp);
	}

	@RequestMapping(value = "/findOne/{id}", method = RequestMethod.GET)
	Employee findOne(@PathVariable("id") String id) {
		return service.findOne(id);
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	List<Employee> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	Boolean delete(@PathVariable("id") String id) {
		return service.delete(id);
	}

}
