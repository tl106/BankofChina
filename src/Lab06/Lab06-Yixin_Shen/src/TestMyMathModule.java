import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMyMathModule {

	private static int input1;
	private static int input2;
	private static int input3;
	private static int input4;
	private static int input5;
	private static int input6;
	
	@BeforeAll
	static void setup() {
	input1 = 3;
	input2 = 6;
	input3 = 2000000000;
	input4 = -2000000000;
	input5 = 0;
	input6 = 7;
	}

	
	@Ignore
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void test1() {
		int myAnswer = 0;
		try {
		myAnswer = MathModule.myMultiply(input1, input2);
		} catch(Exception e) { }
		assertEquals(18, myAnswer);
	}
	
	@Test
	void testError1() {
		int myAnswer = 0;
		try {
		myAnswer = MathModule.myMultiply(input2,input3);
		} catch(Exception e) {
		if(e.getClass() == Exception.class) {
		return; // it passed
		}
		}
		fail("it failed");
	}

	@Test
	void testError2() {
		int myAnswer = 0;
		try {
		myAnswer = MathModule.myMultiply(input2,input4);
		} catch(Exception e) {
		if(e.getClass() == Exception.class) {
		return; // it passed
		}
		}
		fail("it failed");
	}
	
	
	@Test
	void testDivide(){
		double myAnswer = 0;
		try {
			myAnswer = MathModule.myDivide(input2, input1);
		}
		catch(Exception e) {}
		assertEquals(2.0, myAnswer);
	}
	
	
	@Test
	// Test if it could handle divisor is zero.
	void testDivide0() {
		double myAnswer = 0;
		try {
			myAnswer = MathModule.myDivide(input1, input5);
		} 
		catch(Exception e) {
			if(e.getClass() == Exception.class) {
				return; // it passed
		 	}
		}
		fail("it failed");
	}
	
	@Test
	void testDivide2() {
		double myAnswer = 0;
		try {
			myAnswer = MathModule.myDivide(input6, input1);
		} 
		catch(Exception e) {}
		assertEquals(7.0/3.0, myAnswer);
	}
	
	
}
