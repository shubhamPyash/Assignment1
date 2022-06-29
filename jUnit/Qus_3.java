package jUnitAs;

import java.util.Scanner;

public class Qus_3 
{
	
	public static boolean match()
	{
		String email="shubham@gamil.com";
		String  pass="shubh@123";
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		if(email.equals(s) &&pass.equals(s1))
		{
		return true ;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args) 
	{
		
		System.out.println(Qus_3.match());
	}
}
