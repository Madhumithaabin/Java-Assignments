package Assignments;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, i;
		boolean flag;
		number = 17;
		flag = false;
		for (i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(number + " is a Prime Number");

		} else {
			System.out.println(number + " is not a Prime Number");
		}

	}

}
