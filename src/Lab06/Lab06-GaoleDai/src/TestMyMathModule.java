import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMyMathModule {
	private static int input1, input2;
	private static int input3, input4;
	private static int input5, input6, input7;
	private static int input8, input9;
	
	@BeforeAll
	static void setup() {
		input1 = 3;
		input2 = 6;
		input3 = 2000000000;
		input4 = -2000000000;
		input5 = 6;
		input6 = 3;
		input7 = 0;
		input8 = 7;
		input9 = 3;
	}
	
	@Ignore
	void test() {
		int myAnswer = 0;
		try {
			myAnswer = MathModule.myMultiply(input1, input2);
		} catch(Exception e) { }
		assertEquals(18, myAnswer);
	}
	@Test
	void testErrorBig() {
		int myAnswer = 0;
		try {
			myAnswer = MathModule.myMultiply(input2, input3);
		} 
		catch(Exception e) {
			if(e.getClass() == Exception.class) {
				return; // it passed
		 	}
		}
		fail("it failed");
	}
	@Test
	void testErrorSmall() {
		int myAnswer = 0;
		try {
			myAnswer = MathModule.myMultiply(input2, input4);
		} 
		catch(Exception e) {
			if(e.getClass() == Exception.class) {
				return; // it passed
		 	}
		}
		fail("it failed");
	}
//---------------- End of myMultiply Test --------------	
	@Test
	void testDivide1(){
		double myAnswer = 0;
		try {
			myAnswer = MathModule.myDivide(input5, input6);
		}
		catch(Exception e) {}
		assertEquals(2.0, myAnswer);
	}
	
	@Test
	// Test if it could handle divisor is zero.
	void testDivide0() {
		double myAnswer = 0;
		try {
			myAnswer = MathModule.myDivide(input5, input7);
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
			myAnswer = MathModule.myDivide(input8, input9);
		} 
		catch(Exception e) {}
		assertEquals(7.0/3.0, myAnswer);
	}
	
}
