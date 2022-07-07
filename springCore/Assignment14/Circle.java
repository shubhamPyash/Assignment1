package springCoreAssignment14;


//. WAP in which you have to create objects on user demands.
//For example we are having a Interface Shape, now class circle, rectangle and square implements shape interface and 
//shape interface is having two methods. Area and sides of the shape. Now user will choose 
//which class object he wants and on the basis of that you need to print the result.

public class Circle implements Shape  {

	double r;
	

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double Area() {
		
		return (3.14*r*r);
	}

	@Override
	public double Sides() {
		// TODO Auto-generated method stub
		return (2*3.14*r);
	}


	
	
	
	
	
	
}
