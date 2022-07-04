package jUnitAs;

public class Qus_11
{
	private static volatile Qus_11 singletonInstance=new Qus_11();
	
	private  Qus_11() {
		// TODO Auto-generated constructor stub
	}
	
	public static Qus_11 getInstance()
	{
		return singletonInstance;
	}
}

