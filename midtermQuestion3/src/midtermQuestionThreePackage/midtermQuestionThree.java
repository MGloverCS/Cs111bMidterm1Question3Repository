package midtermQuestionThreePackage;

class midtermQuestionThree {
	public static void main(String[] args) {
		int limit = 1000;
		int outPut = fiboCalc(limit);
		System.out.println("The sum of the odd numbers is : " + outPut);
	}
	// Method calculates sum of all odd values of Fibonacci Sequence.
	public static int fiboCalc(int limit) {
		int num1 = 1;
		int num2 = 2;
		int oddSum = 0;
		for (int i = 1; i <= limit; i++) {
			if ((num1 & 1) != 0) { // If statement determines whether Fibonacci value is odd or not.
				oddSum = oddSum + num1;
			}
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			}
		return oddSum;
	}
}