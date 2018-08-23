package selenium.maheshprogramming;

public class OddAndReverse {

	public static void main(String[] args) {

		String str = "javafx";
		String reverse = "", reqMsg = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			if (i % 2 != 0) {
				char c = str.charAt(i);
				reverse += c;
			}
		}
		System.out.println("String reversed and picked odd index character :" + reverse);
	}
}
