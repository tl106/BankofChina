public class MathModule {
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/*try {
			int test = myMultiply(2000000000, 6);
			System.out.println(test);
		} 
		catch(Exception e) {
			System.out.println(e.toString());
		}*/
		
		try {
			double test = myDivide(8, 9);
			double test2 = myDivide(2000000000,1);
			System.out.println(test);
			System.out.println(test2);
		} 
		catch(Exception e) {
			System.out.println(e.toString());
		}
	}	
	
	
	public static int myMultiply(int firstNum, int secondNum) throws Exception {
		long newAnswer = (long) firstNum * secondNum;
		if (newAnswer > Integer.MAX_VALUE) {
			throw new Exception("Number too big!");
		}
		else if (newAnswer < Integer.MIN_VALUE) {
			throw new Exception("Number too small!");
		}
		return firstNum * secondNum;
	}
		
	public static double myDivide(int dividend, int divisor) throws Exception {
		if (divisor == 0) {
			throw new Exception("The divisor is 0!");
		}
		/*
		else if (dividend % divisor != 0) {
			return (float)dividend/divisor;
		}*/
		return (double) dividend / divisor;
	}

}