package com.sts.bnk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@Autowired	EmplyeeRepo repo;
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	Employee save(@RequestBody Employee emp) {
		return repo.save(emp);
	}
	

}
