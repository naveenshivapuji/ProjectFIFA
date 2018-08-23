package selenium.maheshprogramming;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int intnum = number.nextInt();
		System.out.println(reverseANumber(intnum));
	}

	static int reverseANumber(int n) {
		int result = 0;
		while (n != 0) {
			int lastBit = n % 10;
			result = result * 10 + lastBit;
			// result *= 10+lastBit;
			n /= 10;
		}
		return result;
	}
}
