package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.psl.entity.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO{
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	public List<Employee> getAllEmployee(){
		return template.query("select * from employee",new RowMapper<Employee>(){

			public Employee mapRow(ResultSet rs, int arg1)
					throws SQLException {
				Employee e=new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				return e;
			}
			
			 
		});
	//	return null;
	}
		
	
	public void addEmployee(Employee e){
	//	String sql="insert into employee (id,name) values (100,'Rahul')";
		String sql="insert into employee (id,name) values (" +e.getId() +",'"+e.getName()+"')";
		//String sql2="UPDATE employees SET email='rahul@gmail.com' 	WHERE name='Rahul'";
		template.update(sql );
		//template.update(sql2);
	}
}
