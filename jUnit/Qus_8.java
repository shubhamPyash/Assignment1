package jUnitAs;

public class Qus_8 
{
	static int a[]= {2,34,55,34,6};
	
//	-----------------EVEN---------
	public static int  even() 
	{
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
			{
				count++;
			}
			
		}
		return count;
	}
	
//	-------ODD-----------
	public static int  odd() 
	{
		int count1=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2!=0)
			{
				count1++;
			}
			
		}
		return count1;
	}
	
//	public static void main(String[] args) 
//	{
//		Qus_8 no=new Qus_8();
//		
//		System.out.println(no.even());
//		Qus_8 no1=new Qus_8();
//		System.out.println(no1.odd());
//		
//	}
}
