package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = (Employee) ctx.getBean("employee");
		String name = employee.getEname();
		System.out.println("Employee name:"+name);
		int id = employee.getEid();
		System.out.println("Employee id:"+id);
		double sal = employee.getEsalary();
		System.out.println("Employee salary:"+sal);
		String businessunit = employee.getEbu();
		System.out.println("employee bu:"+businessunit);
		int age = employee.getAge();
		System.out.println("employee age:"+age);
	}

}
