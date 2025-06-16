package in.sp.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.student;

public class Main {
public static void main(String[] args) {
	String config="in/sp/resource/applicationContext.xml";
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext(config);	
	student std=(student)context.getBean("stdid");
	String s1=std.toString();
	System.out.println(s1);
}
}
