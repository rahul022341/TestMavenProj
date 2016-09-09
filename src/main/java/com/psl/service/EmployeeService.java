package com.psl.service;

import java.util.List;

import com.psl.dao.IEmployeeDAO;
import com.psl.entity.Employee;

public class EmployeeService {
	
	private IEmployeeDAO dao;
	
	public IEmployeeDAO getDao() {
		return dao;
	}

	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}

	public List<Employee> getAllEmployee(){
		return null;
	}
	
	public void addEmployee(Employee e){
		dao.addEmployee(e);	
	}
}
