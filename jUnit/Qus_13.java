package jUnitAs;

import java.util.Scanner;

public class Qus_13 {

	
	static Scanner sc = new Scanner(System.in);
	public static int addition()
	{
		System.out.println("Enter first Number");
		int num= sc.nextInt();
		System.out.println("Enter Second Number");
		int num1= sc.nextInt();
		
		int c=num +  num1 ;
		return c;		
	}
	public static int substraction()
	{
		System.out.println("Enter first Number");
		int num= sc.nextInt();
		System.out.println("Enter Second Number");
		int num1= sc.nextInt();
		
		int c=num-num1 ;
		return c;	
	}
	public static int multiplication()
	{
		System.out.println("Enter first Number");
		int num= sc.nextInt();
		System.out.println("Enter Second Number");
		int num1= sc.nextInt();
		
		int c=num *num1 ;
		return c;	
	}
	public static int divison()
	{
		System.out.println("Enter first Number");
		int num= sc.nextInt();
		System.out.println("Enter Second Number");
		int num1= sc.nextInt();
		
		int c=num/num1 ;
		return c;	
	}
	public static int modulus()
	{
		System.out.println("Enter first Number");
		int num= sc.nextInt();
		System.out.println("Enter Second Number");
		int num1= sc.nextInt();	
		int c=num % num1 ;
		return c;	
	}
	public static int squareroot()
	{
		System.out.println("Enter Number to check square root");
		int a= sc.nextInt();
		int c=0;
		if(a>0)
		{
			 c=(int) Math.sqrt(a);	
		}
		else
			System.out.println("negative Number is not allowed. ");
		
		return c;		
	}
	public static int cuberoot()
	{
		System.out.println("Enter Number to check Cube root");
		int a= sc.nextInt();
		int cbrt = (int) Math.cbrt(a);	
		return cbrt;		
	}
	
	public static int power()
	{
		System.out.print("Enter the base: ");  
		int base=sc.nextInt();  
		System.out.print("Enter the exponent: ");
		
		int exponent=sc.nextInt();
		int power = 1; 
		if(exponent> 0)
		{
			 	 
			for (int i = 1; i <= exponent; i++)   
			{
				power = power * base;  
			}
		}
		else
		{
			System.out.println("negative power is not allowed");
		}
		
		return power;
	}
}
