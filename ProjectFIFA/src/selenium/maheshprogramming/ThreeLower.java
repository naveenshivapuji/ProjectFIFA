package selenium.maheshprogramming;

public class ThreeLower {

	public static void main(String[] args) {

		String str = "programming";

		String exp = "";

		for (int i = 0; i < str.length(); i++) {
			String c = str.charAt(i) + "";
			if (i < 3)
				exp += c.toLowerCase();
			else
				exp += c.toUpperCase();
		}
		System.out.println("Expected output : " + exp);

	}

}
