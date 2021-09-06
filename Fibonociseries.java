package Assignments;

public class Fibonociseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, firstNumber, secondNumber, result, i;
		firstNumber = 0;
		secondNumber = 1;
		number = 6;
		System.out.println("FibonacciSeries of number " + number + " is");
		for (i = 0; i < number; i++) {

			System.out.println(firstNumber);
			result = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = result;
		}
	}

}
