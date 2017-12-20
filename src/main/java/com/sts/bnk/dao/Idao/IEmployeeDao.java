package com.sts.bnk.dao.Idao;

import java.util.List;

import com.sts.bnk.model.Employee;

public interface IEmployeeDao{
	
	public Employee save(Employee emp);

	public Employee findOne(String id);

	public List<Employee> findAll();

	public Boolean delete(String id);

}
