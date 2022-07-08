package springCoreAssignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMerge {

	public static void main(String[] args) 
	{
		 ApplicationContext objctx=new ClassPathXmlApplicationContext("aplicationContext.xml");
		 Merge2 objmrg=(Merge2) objctx.getBean("mrg2bean");
		 
		 objmrg.addition();
	}

}
