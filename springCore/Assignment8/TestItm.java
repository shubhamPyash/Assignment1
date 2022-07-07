package springCoreAssignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItm {

	public static void main(String[] args) 
	{
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		Itm objItm=(Itm) ctxobj.getBean("itmbeann");
		
		objItm.dsc();
		System.out.println("------------");
		objItm.asc();
		System.out.println("------------");
		objItm.duplicate();
		
	
		
	}

}
