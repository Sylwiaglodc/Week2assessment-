

import static org.junit.Assert.*;

import org.junit.Test;


public class BasicCalcMainTest {
	
	Addition addition = new Addition("Your results are: " + 12); 
	Subtraction subtraction = new Subtraction("Your results are: " + 10);

	@Test
	public void testSetAddition() {
		assertEquals("Your results are: " + 12, addition.getAddition());
		assertNotEquals("Your results are: " + 13, addition.getAddition());
		assertNotNull("", addition.getAddition());
	}
	
	@Test
	public void testSetSub() {
		assertEquals("Your results are: " + 10, subtraction.getSubtraction());
		assertNotEquals("Your results are: " + 8, subtraction.getSubtraction());
		assertNotNull("", subtraction.getSubtraction());
	}
	
	
}
