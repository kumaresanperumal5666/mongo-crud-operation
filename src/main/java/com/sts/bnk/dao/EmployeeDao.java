package com.sts.bnk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.sts.bnk.model.Employee;
import com.sts.bnk.repo.EmpRepo;

@Component
public class EmployeeDao {

	@Autowired
	EmpRepo repo;

	public Employee save(Employee emp) {
		return repo.save(emp);
	}

}
