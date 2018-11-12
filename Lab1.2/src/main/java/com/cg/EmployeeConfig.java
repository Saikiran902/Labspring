package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean
	public Sbu sbu(){
		return new Sbu(123,"kiran","product engineering services");
	}
	
	@Bean
	public Employee employee(){
		Employee emp = new Employee();
		emp.setEid(456);
		emp.setEname("sai");
		emp.setEsalary(2000.0);
		emp.setBusinessUnit(sbu());
		return emp;
	}
}
