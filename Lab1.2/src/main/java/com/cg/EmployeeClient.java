package com.cg;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EmployeeConfig.class);
	     Employee employee = (Employee) ctx.getBean("employee");
	     System.out.println(employee);
	}

}
