package springCoreAssignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmp
{
	public static void main(String[] args) {
	
	ApplicationContext ctxobj = new ClassPathXmlApplicationContext("aplication.xml");
	Empl obj1=(Empl) ctxobj.getBean("embean");
//		obj1.details();
		
		List<Empl> objemp=new ArrayList<Empl>();
		objemp.add(obj1);
		
		List<Empl> slist= objemp.stream().sorted(Comparator.comparing(Empl::getSalary)).collect(Collectors.toList());
		System.out.println(slist);
	}
}
