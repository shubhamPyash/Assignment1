package jUnitAs;

public class Qus_1 
{
	public static int hicF(int a,int b)
	{
		int hc=0;
		for (int j = 1; j < a||j<b; j++) 
		{
			if(a%j==0 && b%j ==0)
			hc=j;
		
		}
		return hc;
	}
	
}
