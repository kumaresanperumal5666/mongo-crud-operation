package com.sts.bnk.service.IService;

import java.util.List;

import com.sts.bnk.model.Employee;

public interface IEmployeeService {
	
	public Employee save(Employee emp);

	public Employee findOne(String id);

	public List<Employee> findAll();

	public Boolean delete(String id);

}
