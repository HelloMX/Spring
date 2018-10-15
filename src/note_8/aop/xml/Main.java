package note_8.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	 public static void main(String[] args) {  
		       ApplicationContext ctx = new ClassPathXmlApplicationContext("note_8/conf/conf-xml.xml");
		         Student stu = (Student)ctx.getBean("stu");
		 	        stu.print("this is name");
			    }  

}
