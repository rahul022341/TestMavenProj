package com.psl.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component (value="emp")
public class Employee {
	private int id;
	
	@Value(value="Rahul")
	private String name;
	
//	@Autowired
//	private Address addr;
	
	public Employee(){
		
		System.out.println("In default constructor of Employee");
	}
	
	public Employee(int id, String name) {
		System.out.println("In param constructor of Employee");
		this.id = id;
		this.name = name;
	//	this.addr = addr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("In set Id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("in setName");
		this.name = name;
	}

/*	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		System.out.println("in setAddr");
		this.addr = addr;
	}*/

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
