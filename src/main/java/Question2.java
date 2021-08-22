
import java.util.List;

import service.LCDDisplayService;

public class Question2 {

	public static void main(String[] args) {
		int number = 2;
		displayNumberToLCD(number, 3, 2);
		System.out.println();

		number = 1234567890;
		displayNumberToLCD(number, 1, 1);
		System.out.println();

		number = 1234567890;
		displayNumberToLCD(number, 1, 2);
		System.out.println();

		number = 987654321;
		displayNumberToLCD(number, 3, 2);
		System.out.println();

		number = 1020304050;
		displayNumberToLCD(number, 4, 3);
		System.out.println();
	}

	private static void displayNumberToLCD(int number, int width, int height) {
		LCDDisplayService lcdDisplayService = new LCDDisplayService();

		List<String[]> lcdDigits = lcdDisplayService.getLCDDigitsFromNumber(number, width, height);

		if (lcdDigits != null && lcdDigits.get(0) != null) {
			for (int i = 0; i < lcdDigits.get(0).length; i++) {
				final int index = i;
				lcdDigits.forEach((String[] lcdDigit) -> {
					System.out.print(lcdDigit[index]);
				});
				System.out.println();
			}
		}
		System.out.println();

	}

}
