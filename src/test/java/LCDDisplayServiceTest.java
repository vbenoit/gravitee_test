import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import service.LCDDisplayService;

class LCDDisplayServiceTest {

	@Test
	void test() {
		LCDDisplayService lcdDisplayService = new LCDDisplayService();

		int number = 123456789;
		List<String[]> lcdDigits = lcdDisplayService.getLCDDigitsFromNumber(number);

		testLine(lcdDigits, 0, "   _  _     _  _  _  _  _ ");
		testLine(lcdDigits, 1, " | _| _||_||_ |_   ||_||_|");
		testLine(lcdDigits, 2, " ||_  _|  | _||_|  ||_| _|");

		number = 987654321;
		lcdDigits = lcdDisplayService.getLCDDigitsFromNumber(number);

		testLine(lcdDigits, 0, " _  _  _  _  _     _  _   ");
		testLine(lcdDigits, 1, "|_||_|  ||_ |_ |_| _| _| |");
		testLine(lcdDigits, 2, " _||_|  ||_| _|  | _||_  |");

		number = 102030405;
		lcdDigits = lcdDisplayService.getLCDDigitsFromNumber(number);

		testLine(lcdDigits, 0, "   _  _  _  _  _     _  _ ");
		testLine(lcdDigits, 1, " || | _|| | _|| ||_|| ||_ ");
		testLine(lcdDigits, 2, " ||_||_ |_| _||_|  ||_| _|");

	}

	private void testLine(List<String[]> lcdDigits, int i, String expectedString) {
		String actualString = lcdDigits.stream().map(lcdDigit -> {
			return lcdDigit[i];
		}).collect(Collectors.joining(""));

		assertEquals(expectedString, actualString);
	}

}