import java.util.Scanner;

/**
 * @author sylw - srglod
 * CIS175 - Spring 2023
 * Jan 23, 2023
 */

public class Addition {

	private String addition;

	
	public Addition() {
		setAddition(this.addition);
		
	}
	
	public Addition(String additions) {
		super();
		setAddition(additions);
		
	}
	

	public String getAddition() {
		return addition;
	}
	public void setAddition(String addition) {
		this.addition = addition;
		
		int input1 = 0;
		int input2 = 0;
		
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter your first digit to add :");
		input1 =in.nextInt();
		
		System.out.println("Please enter your second digit to add :");
		input2 =in.nextInt();
		int result = input1 + input2;
		
		addition = "Your results are: " + result;
				 

		System.out.print(addition);
		
	}
	
}
