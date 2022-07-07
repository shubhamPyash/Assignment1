package springCoreAssignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) 
	{
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		Studentt objstud=(Studentt) ctxobj.getBean("Studenttbean");
		
		objstud.getStud();
		
		
		
	}

}
