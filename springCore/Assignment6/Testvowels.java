package springCoreAssignment6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testvowels {

	public static void main(String[] args) {
	
		 ApplicationContext objctx=new ClassPathXmlApplicationContext("aplicationContext.xml");
	      vowels obj6=(vowels) objctx.getBean("vowelStringbean");
	      obj6.words();
		
	}

}
