
public class MathModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				int test1 = myMultiply(2000000000, 6);
				int test2 = myMultiply(-2000000000, 6);
				System.out.println(test1);
				System.out.println(test2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
				System.out.println(e.toString());
		}
		try {
				double test = myDivided(6, 0);
				System.out.println(test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
				System.out.println(e.toString());
		}
		
		
	}
	public static int myMultiply(int firstNum, int secondNum) throws Exception {
	   long newAnswer = (long)firstNum * secondNum;
       if (newAnswer > Integer.MAX_VALUE) {
            throw new Exception("Number too big");
       }
       else if (newAnswer < Integer.MIN_VALUE) {
    	    throw new Exception("Number too samll");
       }
       return firstNum * secondNum; 
	}
	
	public static double myDivided(int firstNum, int secondNum) throws Exception {
		if(secondNum == 0) {
			throw new Exception("Can't divided by zero");
		}
		return (double)firstNum / secondNum;
	}
	

}
