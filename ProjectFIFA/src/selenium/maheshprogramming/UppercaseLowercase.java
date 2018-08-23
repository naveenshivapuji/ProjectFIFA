package selenium.maheshprogramming;

public class UppercaseLowercase {

	public static void main(String[] args) {

		String input = "programming";

		String exp = "";

		for (int i = 0; i < input.length(); i++) {
			String c = input.charAt(i) + "";
			if (i % 2 == 0)
				exp += c.toUpperCase();
			else
				exp += c.toLowerCase();
		}
		System.out.println("Expected output : " + exp);
	}

}
