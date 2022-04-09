package org.college;

public class Student extends Department {
	
	public void studentName()
	{
	System.out.println("The student name is xxxx");	
	}
	public void studentDept() {
		
		System.out.println("The student name department is YYYY");	
		
	}
	
	public void studentId() {
		
		System.out.println("The student ID is 98163754");	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student stu = new Student();
		
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();		
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
	}

}
