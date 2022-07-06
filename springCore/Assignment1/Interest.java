package springCoreAssignment1;

public class Interest 
{
	private  Interest() {
		// TODO Auto-generated constructor stub
	}
	
	public static Interest getobj()
	{
		return new Interest();
	}
	
	public void showi()
	{
		System.out.println("Interest based obj created");
	}
}
