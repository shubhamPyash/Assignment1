package jUnitAs;

import java.util.Scanner;

public class Qus_6
{
	public static int vowels()
	{
//		Scanner sc=new Scanner(System.in);
		String str="abdceu";
		
		int count = 0;

		for (int i = 0; i < str.length(); i++)
		{
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
            || str.charAt(i) == 'o'
            || str.charAt(i) == 'u')
			{
				count++;
			}
			
		}
		return count;
	
	}
//	public static void main(String[] args) 
//	{
//		Qus_6 num1=new Qus_6();
//		System.out.println(num1.vowels());
//	}
}
