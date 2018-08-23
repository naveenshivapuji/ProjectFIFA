package selenium.maheshprogramming;

import java.util.Scanner;

public class FindCountElements {

	public static void main(String[] args) {
		int count = 0, upCount = 0, lowCount = 0, spaceCount = 0;
		Scanner s = new Scanner(System.in);
		String inputText = s.nextLine();
		System.out.println("The text entered : " + inputText);
		for (int i = 0; i < inputText.length(); i++) {
			for (int j = 48; j < 58; j++) {
				int str = inputText.charAt(i);
				if (str == j) {
					count = count + 1;
				}
			}
			for (int j = 65; j < 90; j++) {
				int str = inputText.charAt(i);
				if (str == j)
					upCount = upCount + 1;
			}
			for (int j = 97; j < 122; j++) {
				int str = inputText.charAt(i);
				if (str == j)
					lowCount = lowCount + 1;
			}
			int str = inputText.charAt(i);
			if (str == 32)
				spaceCount = spaceCount + 1;
		}
		System.out.println("Total no of characters in string : " + inputText.length());
		System.out.println("Total no of numeric values       : " + count);
		System.out.println("Total no of UPPER CASE letters   : " + upCount);
		System.out.println("Total no of LOWER CASE letters   : " + lowCount);
		System.out.println("Total no of SPACES in string     : " + spaceCount);
	}
}










// public static void main(String[] args) {
//
// int count = 0, upCount = 0, lowCount = 0;
// Scanner s = new Scanner(System.in);
// String inputText = s.nextLine();
// System.out.println("The text entered : " + inputText);
// for (int i = 0; i < inputText.length(); i++) {
// for (int j = 48; j < 58; j++) {
// for (int k = 65; k < 90; k++) {
// for (int l = 97; l < 122; l++) {
// int str = inputText.charAt(i);
//
// if(str==l)
// {
// count = count + 1;
// }
// else if(str == k)
// {
// upCount = upCount + 1;
// }
// else if(str==j)
// {
// lowCount = lowCount + 1;
// }
// }
// }
// }
// }
// System.out.println(count);
// System.out.println(upCount);
// System.out.println(lowCount);
// }