package jUnitAs;

import java.util.Scanner;

public class Qus_2 
{
	
	public static boolean pali_drom()
	{
		String s="abc";
		String s2="cba";
		String s3="";
		for (int i = s.length()-1; i >=0; i--) 
		{
			s3=s3+s.charAt(i);
		}
		if(s.equals(s3))
		{
			return false;
		}
		else
		{
		return true;
		}
	}
	public static void main(String[] args) {
		Qus_2 s=new Qus_2();
		System.out.println(s.pali_drom());
	}
	
}
