import java.util.Scanner;

/**
 * @author sylw - srglod
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */


public class Subtraction {

private String subtraction;

	
	public Subtraction() {
		setSubtraction(this.subtraction);
		
	}
	
	public Subtraction(String subtractions) {
		super();
		setSubtraction(subtractions);
		
	}
	

	public String getSubtraction() {
		return subtraction;
	}
	public void setSubtraction(String subtraction) {
		
		int input1 = 0;
		int input2 = 0;
		
		Scanner sub = new Scanner (System.in);
		System.out.println("Please enter your first digit to subtract :");
		input1 =sub.nextInt();
		
		System.out.println("Please enter your second digit to subtract :");
		input2 =sub.nextInt();
		int result = input1 - input2;
		
		subtraction = "Your results are: " + result;

		 
		System.out.println(subtraction);
	}
}
