package springCoreAssignment14;

public class Rectangle implements Shape 
{
	
	double l;
	double b;

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return l*b;
	}

	@Override
	public double Sides() {
		// TODO Auto-generated method stub
		return (2*l*b);
	}
	
}
