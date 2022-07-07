package springCoreAssignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClassavg {

	public static void main(String[] args) {
		
		 ApplicationContext objctx=new ClassPathXmlApplicationContext("aplicationContext.xml");
	        Average avgobj= (Average) objctx.getBean("Avgbean");
	        avgobj.avg();
	}

}
