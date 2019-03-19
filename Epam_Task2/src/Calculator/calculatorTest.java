package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorTest {

	calculator obj=new calculator();
	@Test
	void testAdd() {
		assertEquals(10, obj.add(5,5));
		assertEquals(6, obj.add(10,-4));
		assertEquals(0, obj.add(5,-5));
		assertEquals(-6, obj.add(-10,4));
		assertEquals(6, obj.add(0,6));
	}
	@Test
	void testMultiply()
	{
		assertEquals(25, obj.multiply(5,5));
		assertEquals(-40, obj.multiply(10,-4));
		assertEquals(-25, obj.multiply(5,-5));
		assertEquals(40, obj.multiply(-10,-4));
		assertEquals(0, obj.multiply(0,6));
		
	}
	@Test
	void testDivide()
	{
		assertEquals(1.0, obj.divide(5,5));
		assertEquals(5.0, obj.divide(25,5));
		assertEquals(-5.0, obj.divide(-25,5));
		assertEquals(-5.0, obj.divide(25,-5));
		assertEquals(5.0, obj.divide(-25,-5));
		Assertions.assertThrows(ArithmeticException.class,()->obj.divide(25, 0));
	}

}
