package com.sts.bnk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.bnk.dao.EmployeeDao;
import com.sts.bnk.model.Employee;
import com.sts.bnk.service.IService.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService{

	@Autowired
	EmployeeDao dao;

	public Employee save(Employee emp) {
		return dao.save(emp);

	}

	public Employee findOne(String id) {
		return dao.findOne(id);

	}

	public List<Employee> findAll() {
		return dao.findAll();

	}

	public Boolean delete(String id) {
		return dao.delete(id);
		

	}

}
