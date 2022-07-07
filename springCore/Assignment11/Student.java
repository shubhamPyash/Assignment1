package springCoreAssignment11;

import java.time.LocalDate;

public class Student 
{
//	WAP in spring core where we will inject dependent object of result class in student class.
//	In 
//	student class following fields will be present studentname, rollno, date of birth, classname, 
//	section. 

//	Create five bean of each and inject the bean as per roll no. Now you need to load the 
//	bean from container.
//	Load all the objects in List and filter the data on the basis of total 
//	marks obtain by each student.

	String studentname;
	int rollno;
	String dob;
	String classname;
	 Result rslt;
	
	
	
	
	public Result getRslt() {
		return rslt;
	}
	public void setRslt(Result rslt) {
		this.rslt = rslt;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	public void show()
	{
		 
		System.out.println("Roll No:- "+getRollno());
		System.out.println("Student Name:- "+studentname);
		System.out.println("Class name:- "+classname);
		System.out.println("dateOfBirth:- "+dob);
//		System.out.println("rollno:- "+rslt.getRoll_no());
		System.out.println("maths:- "+rslt.getMaths());
		System.out.println("hindi:- "+rslt.getHindi());
		System.out.println("English:- "+rslt.getEnglish());
		System.out.println("science:- "+rslt.getScience());
		
		int Total = (int) (rslt.getMaths() + rslt.getHindi() + rslt.getEnglish()+rslt.getScience());

		System.out.println("total:- " +Total);
		
		
	}
	
	
	
	
	
}
