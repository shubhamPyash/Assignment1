package jUnitAs;

public class Qus_12 implements Cloneable
{
	  
	
	int id;
	String name;
	
	public Qus_12(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
	public static boolean method(Qus_12 s1,Qus_12 s2)
	{
		if(s1.id==s2.id && s1.name==s2.name)
			return true;
		else
			return false;
		
	}
	
	
	
	
}
