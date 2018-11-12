package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class EmployeeClient {
	
public static void main(String[] args) {
	
	ApplicationContext app = new ClassPathXmlApplicationContext("employee.xml");
	SBU s = (SBU) app.getBean("emp");
	System.out.println(s);

}
}
