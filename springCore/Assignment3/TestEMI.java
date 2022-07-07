package springCoreAssignment3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEMI {

	public static void main(String[] args) {
		
		ApplicationContext ctxobj=new ClassPathXmlApplicationContext("aplicationContext.xml");
		EMI eobj=(EMI) ctxobj.getBean("emibean");
		System.out.println("rate of interest:- "+ eobj.rate+"%");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("amount");
		float amt=sc.nextFloat();
		
		System.out.println("enter years");
		int validity=sc.nextInt();
		int validamt=validity*12;
		
		double total=amt+(amt*eobj.rate)/100 *validity;
		System.out.println("total amt"+total);
		
		double emii=total/validamt;
		System.out.println("emi "+emii);
	}

}
