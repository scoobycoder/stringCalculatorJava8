package stringCalculatorJava8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

	@Test
	public void shouldAddTwoNumbers() {
		StringCalc stringCalc = new StringCalc();
		assertEquals(3, stringCalc.calc("1,2"));
	}
	
	@Test
	public void shouldAddThreeNumbers() {
		StringCalc stringCalc = new StringCalc();
		assertEquals(4, stringCalc.calc("0,1,3"));
	}
	
}
