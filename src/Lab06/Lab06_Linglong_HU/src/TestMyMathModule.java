import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestMyMathModule {
	private static int input1, input2, input3, input4;
	private static int input5, input6;
	@BeforeAll
    static void setup() {
		input1 = 3;
		input2 = 6; 
		input3 = 2000000000;
		input4 = -2000000000;
		input5 = 7;
		input6 = 0;
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
	             myAnswer = MathModule.myMultiply(input2, input3);
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
	             myAnswer = MathModule.myMultiply(input2, input4);
	        } catch(Exception e) {
	             if(e.getClass() == Exception.class) {
	                  return; // it passed
	             }
	        }
	        fail("it failed");
	   }
	@Test
		void test2() {
		double myAnswer = 0;
		try {
			myAnswer = MathModule.myDivided(input2, input1);
		} catch (Exception e) {}
			// TODO Auto-generated catch block
			assertEquals(2, myAnswer);
	}
	@Test
		void test3() {
			double myAnswer = 0;
			try {
				myAnswer = MathModule.myDivided(input5, input1);
			} catch (Exception e) {}
				// TODO Auto-generated catch block
				assertEquals(7.0/3, myAnswer);
			
		}
	@Test
		void testError3() {
	        double myAnswer = 0;
	        try {
	             myAnswer = MathModule.myDivided(input2, input6);
	        } catch(Exception e) {
	             if(input6 == 0) {
	                  return; // it passed  
	             }
	             System.out.println("You can't divided by 0!");
	        }
	        fail("it failed");
	   }


}
