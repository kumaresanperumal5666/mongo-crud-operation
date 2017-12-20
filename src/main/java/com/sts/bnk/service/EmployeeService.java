package com.sts.bnk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sts.bnk.dao.EmployeeDao;
import com.sts.bnk.model.Employee;

@Service
public class EmployeeService {

	
	@Autowired EmployeeDao dao;
	
	public Employee save(Employee emp) {
		return dao.save(emp);
		
	}
	
}
