package jUnitAs;

public class Qus_7
{
	public static String checkPrimeorNot()
	{

		  int r;
		  int sum=0;    
		  int n=121;  
		  int temp=n;    
		  while(n>0)
		  {    
		   r=n%10;   
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum) 
		   return "palindrome number";    
		  else    
		   return "not palindrome";    
 
	}
	public static void main(String[] args)
		  {
			  Qus_7 qus=new Qus_7();
			  System.out.println(qus.checkPrimeorNot());
			  
		  }
	
}