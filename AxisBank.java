package week3.day1.assignment3;

public class AxisBank extends BankInfo {
	
public void deposit() {
		
		System.out.println("the deposit amount is 900000");
	}

	public static void main(String[] args) {
		
		AxisBank Axis= new AxisBank();
		Axis.saving();
		Axis.fixed();
		Axis.deposit();	

	}

}
