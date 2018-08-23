package selenium.maheshprogramming;

public class OddEven {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("even :" + i + " ");
			} else {
				System.out.print("odd :" + i + " ");
			}
		}

		//Pick the odd index letters from a string
		String message = "Hello World", reqMsg = "";

		for (int i = 0; i < message.length(); i += 2) {
			reqMsg += message.charAt(i);
			// char c = message.charAt(i);
			// reqMsg += c;
		}
		System.out.println("Message  : " + reqMsg);

	}
}
