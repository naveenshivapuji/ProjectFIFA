package selenium.maheshprogramming;

import java.util.Scanner;

public class AddDigitsAndPalindrome extends ReverseInteger {
	// add digits of a given number
	static int addDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int lastBit = n % 10;
			sum += lastBit;
			n = n / 10;
		}
		return sum;
	}

	// Method to find odd and even sum of digits
	static void oddEven(int n) {
		int evensum = 0, oddsum = 0;
		while (n != 0) {
			int lastBit = n % 10;
			if (lastBit % 2 == 0) {
				evensum += lastBit;
			} else {
				oddsum += lastBit;
			}
			n /= 10;
		}
		System.out.println("The sum of even numbers is : " + evensum);
		System.out.println("The sum of odd numbers is : " + oddsum);
	}

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(addDigits(num));
		oddEven(num);
		// used inheritance concept to reverse number
		int rev = ReverseInteger.reverseANumber(num);
		if (rev == num)
			System.out.println("Given number " + num + " is Palindrome");
		else
			System.out.println("Given number " + num + " is not Palindrome");
	}

}
