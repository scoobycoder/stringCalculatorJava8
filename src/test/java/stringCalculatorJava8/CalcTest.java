package stringCalculatorJava8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	private StringCalc stringCalc;

	@Before
	public void setup() {
		stringCalc = new StringCalc();
	}
	
	@Test
	public void shouldAddTwoNumbers() {
		assertEquals(3, stringCalc.calc("//,1,2"));
	}
	
	@Test
	public void shouldAddThreeNumbers() {
		assertEquals(4, stringCalc.calc("//,0,1,3"));
	}
	
	@Test
	public void shouldHandleAnyDelimitterPassed() {
		assertEquals(3, stringCalc.calc("//;\n1;2"));
	}
	
	@Test
	public void shouldHandleZAsDelimitter() {
		assertEquals(3, stringCalc.calc("//Z\n1Z2"));
	}
	
}
