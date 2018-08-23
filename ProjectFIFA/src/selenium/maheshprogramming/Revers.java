package selenium.maheshprogramming;

public class Revers {

	public static void main(String[] args) {

		String message = "Hello";
		String reverse = "";
		for (int i = message.length() - 1; i >= 0; --i) {

			char c = message.charAt(i);
			reverse = reverse + c;
		}
		System.out.println("Reverse " + reverse);
	}
}
