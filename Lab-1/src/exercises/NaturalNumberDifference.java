package exercises;

import java.util.Scanner;

public class NaturalNumberDifference {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a range: ");
		int n = scn.nextInt();
		System.out.println("Difference between sum of square and square of sum is: " + calculateDifference(n));
		scn.close();
	}

	
	static int calculateDifference(int n) {
		int sum1 = 0;
		int sum2 = 0;
		int difference = 0;

		for (int i = 0; i <= n; i++) {
			sum1 += (i * i);
			sum2 += i;
		}
		int squareOfSum = (sum2 * sum2);
		difference = squareOfSum - sum1;
		return difference;

	}

}


