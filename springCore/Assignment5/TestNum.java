package springCoreAssignment5;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestNum {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		Number ob=(Number) ctxobj.getBean("numbean");
		ob.method(new int[] {10,23,45,34,8,90,57});

		
	}

}
