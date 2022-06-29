package jUnitAs;

public class Qus_5
{
	public static int payth()
	{

		int a[]= {3,4,5,10,8,6,9};
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for (int j = i+1; j < a.length-1; j++)
			{
				for (int k = j+1; k < a.length; k++) 
				{
					if(a[i]*a[i]==(a[j]*a[j]+a[k]*a[k]) || a[j]*a[j]==(a[i]*a[i]+a[k]*a[k]) || a[k]*a[k]==(a[i]*a[i]+a[j]*a[j]));
					{
					System.out.println(a[i]+" "+a[j]+" "+a[k]);
					cnt++;
					}
				}
			}
		}
		return cnt;
	}
//	public static void main(String[] args) {
//		System.out.println(Qus_5.payth());
//	}
}
