package springCoreAssignment9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcity {

	public static void main(String[] args) 
	{
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		City objcity1=(City)  ctxobj.getBean("citybean1");
		City objcity2=(City)   ctxobj.getBean("citybean2");
		
		objcity1.details();
		objcity2.details();
	
	}

}
