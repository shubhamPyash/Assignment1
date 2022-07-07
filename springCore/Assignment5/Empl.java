package springCoreAssignment4;

public class Empl
{
//	WAP to perform demonstrate autowire.
//	Use Two classes, first class Employee,
//	second 	department now store all employee and department details.
//	Print employee details in order by employee salary .
	
	int empid;
	String empname;
	double salary;
	Department dept;

	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public void details()
	{
		System.out.println("Employee Id"+empid);
		System.out.println("Employee name"+empname);
		System.out.println("Employee Salary"+salary);
		System.out.println("Employee Dept"+dept);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
