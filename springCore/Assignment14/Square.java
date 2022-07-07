package springCoreAssignment14;

public class Square implements Shape
{

	double s;
	
	
	public Square(double s) 
	{
		this.s = s;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return (s*s);
	}

	@Override
	public double Sides() {
		// TODO Auto-generated method stub
		return (4*s);
	}
	
}
