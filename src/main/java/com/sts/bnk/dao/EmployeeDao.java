package com.sts.bnk.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sts.bnk.dao.Idao.IEmployeeDao;
import com.sts.bnk.model.Employee;
import com.sts.bnk.repo.EmpRepo;

@Component
public class EmployeeDao implements IEmployeeDao{

	@Autowired
	EmpRepo repo;

	public Employee save(Employee emp) {
		return repo.save(emp);
	}
	
	public Employee findOne(String id) {
		return repo.findOne(id);
	}
	
	public List<Employee> findAll() {
		return repo.findAll();
	}
	
	public Boolean delete(String id) {
		repo.delete(id);
		return true;
	}
	
	

}
