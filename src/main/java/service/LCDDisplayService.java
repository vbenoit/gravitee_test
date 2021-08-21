package service;

import java.util.ArrayList;
import java.util.List;

public class LCDDisplayService {

	public List<String[]> getLCDDigitsFromNumber(int number) {
		String numberToString = String.valueOf(number);

		List<String[]> lcdDigits = new ArrayList<String[]>();

		for (String digit : numberToString.split("")) {
			addDigitToLCDDisplay(lcdDigits, digit);
		}

		return lcdDigits;
	}

	private static void addDigitToLCDDisplay(List<String[]> lcdDigits, String digit) {
		String[] lcdDigit = getLCDDigit(" ", " ", " ");
		if ("1".equals(digit)) {
			lcdDigit = getLCDDigit("  ", " |", " |");

		} else if ("2".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", " _|", "|_ ");

		} else if ("3".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", " _|", " _|");

		} else if ("4".equals(digit)) {
			lcdDigit = getLCDDigit("   ", "|_|", "  |");

		} else if ("5".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", "|_ ", " _|");

		} else if ("6".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", "|_ ", "|_|");

		} else if ("7".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", "  |", "  |");

		} else if ("8".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", "|_|", "|_|");

		} else if ("9".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", "|_|", " _|");

		} else if ("0".equals(digit)) {
			lcdDigit = getLCDDigit(" _ ", "| |", "|_|");

		}

		lcdDigits.add(lcdDigit);
	}

	private static String[] getLCDDigit(String string, String string2, String string3) {
		String[] lcdDigit = new String[3];
		lcdDigit[0] = string;
		lcdDigit[1] = string2;
		lcdDigit[2] = string3;
		return lcdDigit;
	}

}
