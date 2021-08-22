import java.util.List;

import service.LCDDisplayService;

public interface LCDDisplayQuestion {

	static void displayNumberToLCD(int number, int width, int height, LCDDisplayService lcdDisplayService) {

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
