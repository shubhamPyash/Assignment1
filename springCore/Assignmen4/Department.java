package springCoreAssignment4;

public class Department 
{
	String deptname;
	
	
	public Department(String deptname) 
	{
		this.deptname = deptname;
	}
	

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


	@Override
	public String toString() {
		return "Department [deptname=" + deptname + "]";
	}
	
	
}
