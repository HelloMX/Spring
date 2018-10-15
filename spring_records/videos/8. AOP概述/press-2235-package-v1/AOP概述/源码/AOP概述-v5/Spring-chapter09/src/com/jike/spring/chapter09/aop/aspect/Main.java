package com.jike.spring.chapter09.aop.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	 public static void main(String[] args) {  
		       ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/conf-aspect.xml");  
		         Student stu = (Student)ctx.getBean("stu");  
		 	        stu.print("whc");  
			    }  

}
