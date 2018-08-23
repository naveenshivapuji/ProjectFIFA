package selenium.maheshprogramming;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a word");

		String actStr = s.next();

		String reverse = "";
		for (int i = actStr.length() - 1; i >= 0; --i) {

			char c = actStr.charAt(i);
			reverse = reverse + c;
		}
		System.out.println("Reverse " + reverse);

		if (actStr.equalsIgnoreCase(reverse)) {
			System.out.println(" palidrome");
		} else {

			System.out.println("not palindrome");
		}

		s.close();
	}

}
