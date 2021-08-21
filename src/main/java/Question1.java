
import java.util.List;

import service.LCDDisplayService;

public class Question1 {

	public static void main(String[] args) {
		int number = 123456789;
		displayNumberToLCD(number);
		System.out.println();

		number = 987654321;
		displayNumberToLCD(number);
		System.out.println();

		number = 102030405;
		displayNumberToLCD(number);
		System.out.println();
	}

	private static void displayNumberToLCD(int number) {
		LCDDisplayService lcdDisplayService = new LCDDisplayService();

		List<String[]> lcdDigits = lcdDisplayService.getLCDDigitsFromNumber(number, 1, 1);

		lcdDigits.forEach((String[] lcdDigit) -> {
			System.out.print(lcdDigit[0]);
		});
		System.out.println();

		lcdDigits.forEach((String[] lcdDigit) -> {
			System.out.print(lcdDigit[1]);
		});
		System.out.println();

		lcdDigits.forEach((String[] lcdDigit) -> {
			System.out.print(lcdDigit[2]);
		});
		System.out.println();

	}

}
