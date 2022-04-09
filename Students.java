package week3.day1.assignment4;

public class Students {
	
	public void getStudentInfo(int id) 
	{
		System.out.println("the student id is "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("the student id is " + id  );
		System.out.println("the student name is " + name);
		
	}
	
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("the student email is " + email);
		System.out.println("the student phonenumber is " + phoneNumber);
		
	}

	public static void main(String[] args) {
		
		
	Students st = new Students();
	st.getStudentInfo(12345);
	st.getStudentInfo(12345, "XXXX");
	st.getStudentInfo("asugsagf@gmail.com",123456789);

	}

}
