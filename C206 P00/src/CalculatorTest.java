import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21023096, 1 Jun 2022 11:17:30 am
 */

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		//Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.add(a, b);
		
		//Assert
		int expected = 5555;
		assertEquals(expected,actual);
	
	}
	
	@Test
	public void testSubtract() {
		
		//Arrange
		int a = 9876;
		int b = 4321;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.subtract(a,b);
		
		//Assert
		int expected = 5555;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testMultiply() {
		
		//Arrange
		int a = 1;
		int b = 5;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.multiply(a,b);
		
		//Assert
		int expected = 5;
		assertEquals(expected,actual);
	}
	
	@Test
	public void testDivide() {
		
		//Arrange
		int a = 15;
		int b = 3;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.divide(a,b);
		
		//Assert
		int expected = 5;
		assertEquals(expected,actual);
		//comment
	}
	

}
