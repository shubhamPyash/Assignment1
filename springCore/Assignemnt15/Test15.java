package springCoreAssignment15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test15 {

	public static void main(String[] args) 
	{
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		Customer custobj=(Customer) ctxobj.getBean("custbean");
		
		custobj.showw();

	}

}
