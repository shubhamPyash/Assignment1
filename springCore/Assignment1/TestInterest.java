package springCoreAssignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInterest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		Interest obj=(Interest) ctxobj.getBean("interestbean");
		obj.showi();
	}

}
