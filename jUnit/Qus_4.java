package jUnitAs;

public class Qus_4 
{
	public static String arms()
	{
		
		int no=153;
		int temp=no;
		int r;
		int add=0;
		while(no>0)
		{
			r=no%10;
			no=no/10;
			add=add+r*r*r;
		}
		if(temp==add)
			return "armstrong no";
		else
			return "not armstrong no";
		
	}
	

}
