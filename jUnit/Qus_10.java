
package jUnitAs;
	
public class Qus_10 
{
	public static String concat()
	{
		String[] fruits={"apple","orange","banana","lemon"};
		String s="";
		for (int i = 0; i < fruits.length; i++) 
		{
			if(i==fruits.length-1)
			{
				s=s+fruits[i];
			}
			else
			{
				s=s+fruits[i]+"-";
			}
		}
		return s;
		
	}
//	public static void main(String[] args) {
//		System.out.println(Qus_10.concat());
//	}

}
