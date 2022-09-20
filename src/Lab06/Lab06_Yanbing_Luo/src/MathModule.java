
public class MathModule {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		try {
			int test = myMutiply(3, 6);
			System.out.println(test);
			int[] test1 = myDivide(7,3);
			System.out.println(test1[0]);
			System.out.println(test1[1]);
		} catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	public static int myMutiply(int firstNum, int secondNum) throws Exception {
		long newAnswer = (long) firstNum * secondNum;
		if (newAnswer > Integer.MAX_VALUE) {
			throw new Exception("Number too big");
		}
		if (newAnswer < Integer.MIN_VALUE) {
			throw new Exception("Number too small");
		}
		return firstNum * secondNum;
	}
	public static int[] myDivide(int firstNum, int secondNum) throws Exception {
		if (secondNum == 0) {
			throw new Exception("The second number cannot be zero!");
		}
		long newAnswer = (long) firstNum / secondNum;
		if (newAnswer > Integer.MAX_VALUE) {
			throw new Exception("Number too big");
		}
		if (newAnswer < Integer.MIN_VALUE) {
			throw new Exception("Number too small");
		}
		int[] array = {firstNum / secondNum, firstNum % secondNum};
		return array;
	}

}
