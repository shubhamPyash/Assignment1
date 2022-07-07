package springCoreAssignment11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args)
	{
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		Student student=(Student) ctxobj.getBean("studentbean");
		Student student1=(Student) ctxobj.getBean("studentbean1");
		Student student2=(Student) ctxobj.getBean("studentbean2");
		Student student3=(Student) ctxobj.getBean("studentbean3");
		Student student4=(Student) ctxobj.getBean("studentbean4");

		
		student.show();
		System.out.println("-----");
		student1.show();
		System.out.println("-----");
		student2.show();
		System.out.println("-----");
		student3.show();
		System.out.println("-----");
		student4.show();
		
		List<Student> list=new ArrayList();
		list.add(student);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		for(Student s:list)
		{
			System.out.println(s.rollno+s.studentname+s.classname+s.dob);
		}
		
		
		
	}

}
