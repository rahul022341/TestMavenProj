package com.psl.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.aop.Performer;
import com.psl.entity.Employee;
import com.psl.service.EmployeeService;

public class Client {

	private static EmployeeService service;
	
	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}

	public static void main(String[] args) throws Exception{
		//Spring container initialization
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//get beans
		//Employee e = (Employee)context.getBean("emp");
		
		//invoking business logic
	//	System.out.println(e.toString());
		//service.addEmployee(e);
	//	System.out.println("In client add employee flow");
	//	System.out.println("in get employee");
		//List <Employee> list =service.
		
		
	//	System.out.println("Done adding Employee");
		
		Performer p=(Performer) context.getBean("performer");
		p.perform();
	}
/*	public void call(){
		service.addEmployee(e);
	}*/
}
