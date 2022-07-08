package springCoreAssignment7;

public class Merge2 
{
	int arr2[]=new int[5];
	
	Merge mrg;
	
	public Merge2(int[] arr2,Merge mrg) 
	{
		super();
		this.arr2 = arr2;
		this.mrg=mrg;
	}
	
	public void addition()
	{
		int arr3[] =new int[arr2.length+mrg.arr.length];
		int count=0;
		
		for (int i = 0; i < arr3.length; i++) 
		{
			if(arr3.length>i)
			{
				arr3[count++]=arr2[i];
			}
			if(mrg.arr.length>i)
			{
				arr3[count]=mrg.arr[i];
			}
		}
		int maximun=Integer.MAX_VALUE;
		for (int i = 0; i < arr3.length; i++)
		{
			if(maximun<arr3[i])
			{
				maximun=arr3[i];
			}
		}
		System.out.println("max is :- "+maximun);
	}
	
	
}
