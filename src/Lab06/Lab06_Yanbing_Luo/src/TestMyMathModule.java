import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMyMathModule {
	private static int input1;
	private static int input2;
	private static int input3;
	private static int input4;
	
	@BeforeAll
	static void setup() {
		input1 = 3;
		input2 = 7;
		input3 = -2000000000;
		input4 = 0;
	}
	
	@Ignore
	void test() {
		fail("ипн╢й╣ож");
	}
	
	@Test
	void test1_mul() {
		int myAnswer = 0;
		try {
			myAnswer = MathModule.myMutiply(input1, input2);
		} catch(Exception e) {}
		assertEquals(21, myAnswer);
	}
	
	@Test 
	void testError_mul() {
		int myAnswer = 0;
		try {
			myAnswer = MathModule.myMutiply(input2, input3);
		} catch(Exception e) {
			if(e.getClass() == Exception.class) {
				return;
			}
		}
		fail("it failed");
	}
	
	@Test
	void test1_div() {
		int[] myAnswer = null;
		try {
			myAnswer = MathModule.myDivide(input2, input1);
		} catch(Exception e) {}
		assertEquals(2, myAnswer[0]); // Integer answer
		assertEquals(1, myAnswer[1]); // Remainder
	}
	
	@Test 
	void testError_div() {
		int[] myAnswer = null;
		try {
			myAnswer = MathModule.myDivide(input2, input4);
		} catch(Exception e) {
			if(e.getClass() == Exception.class) {
				return;
			}
		}
		fail("it failed");
	}
	

}
