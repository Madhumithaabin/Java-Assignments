package Assignments;

public class Factorialnumber {

	public Factorialnumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, result = 1, i;
		number = 6;

		for (i = number; i >= 1; i--) {
			result = result * i;

		}
		System.out.println("Factorial of a Number " + number + " is " + result);
	}

}
