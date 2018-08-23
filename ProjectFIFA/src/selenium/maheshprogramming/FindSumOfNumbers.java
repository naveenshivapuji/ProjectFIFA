package selenium.maheshprogramming;

import java.util.Scanner;

public class FindSumOfNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a alpha numeric value : ");
		String input = s.next();

		char[] c = input.toCharArray();

		int sum = 0;

		for (int i = 0; i < c.length; i++) {

			if (c[i] >= 48 && c[i] <= 57)
				sum += c[i] - 48;

		}

		System.out.println("sum is : " + sum);
	}

}
