package springCoreAssignment5;

public class Defined_Class implements Number
{
	public void method(int[] a)
	{
		int max=a[0];
		
		for(int j:a)
		{
			if(j>max)
				max=j;
		}
		System.out.println("max num:- "+ max);
	}
}
