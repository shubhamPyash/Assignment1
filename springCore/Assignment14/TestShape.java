package springCoreAssignment14;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {

	public static void main(String[] args) 
	{
		
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		Shape objShape=(Shape) ctxobj.getBean("cirbean");
		Shape objShape1=(Shape) ctxobj.getBean("Squrbean");
		Shape objShape2=(Shape) ctxobj.getBean("Rectbean");
		
		
		System.out.println("------------------------");
		System.out.println("For Circle");
		System.out.println("Arae of circle:- "+objShape.Area());
		System.out.println("Sides of Circle:- "+objShape.Sides());
		
		System.out.println("------------------------");
		System.out.println("for Square");
		System.out.println("Arae of square:- "+objShape1.Area());
		System.out.println("Sides of square:- "+objShape1.Sides());
		
		
		System.out.println("------------------------");
		System.out.println("for Rectangle");
		System.out.println("Arae of rect:- "+objShape2.Area());
		System.out.println("Sides of rect:- "+objShape2.Sides());
//		
		
	}

}
