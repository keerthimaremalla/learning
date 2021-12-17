package PrimitiveDataTypes;

public class IfElse {
	public static void main(String args[]) {
		int testscore  = 70;
		char grade;
		if(testscore>=75) {
			grade='A';	
		}
		else {
			grade='F';
		}
		System.out.println("Grade is " + grade);
	}

}
