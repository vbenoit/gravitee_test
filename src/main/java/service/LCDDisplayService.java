package service;

import java.util.ArrayList;
import java.util.List;

public class LCDDisplayService {

	public List<String[]> getLCDDigitsFromNumber(int number, int width, int height) {
		String numberToString = String.valueOf(number);

		List<String[]> lcdDigits = new ArrayList<String[]>();

		for (String digit : numberToString.split("")) {
			if (width == 1 && height == 1) {
				addDigitToLCDDisplay(lcdDigits, digit);
			} else {
				addDigitToLCDDisplay(lcdDigits, digit, width, height);
			}
		}

		return lcdDigits;
	}

	private void addDigitToLCDDisplay(List<String[]> lcdDigits, String digit) {
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

	private void addDigitToLCDDisplay(List<String[]> lcdDigits, String digit, int width, int height) {
		int rowNumber = getRowNumber(height);

		String[] lcdDigit = new String[rowNumber];

		if ("1".equals(digit)) {
			String topChar = " ";
			String[] middleChars = { " ", "|", " " };
			String[] bottomChars = { " ", "|", " " };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("2".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { " ", "|", "_" };
			String[] bottomChars = { "|", " ", "_" };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);
		} else if ("3".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { " ", "|", "_" };
			String[] bottomChars = { " ", "|", "_" };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("4".equals(digit)) {
			String topChar = " ";
			String[] middleChars = { "|", "|", "_" };
			String[] bottomChars = { " ", "|", " " };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("5".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { "|", " ", "_" };
			String[] bottomChars = { " ", "|", "_" };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("6".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { "|", " ", "_" };
			String[] bottomChars = { "|", "|", "_" };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("7".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { " ", "|", " " };
			String[] bottomChars = { " ", "|", " " };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("8".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { "|", "|", "_" };
			String[] bottomChars = { "|", "|", "_" };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("9".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { "|", "|", "_" };
			String[] bottomChars = { " ", "|", "_" };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);

		} else if ("0".equals(digit)) {
			String topChar = "_";
			String[] middleChars = { "|", "|", " " };
			String[] bottomChars = { "|", "|", "_" };
			processLCDDigit(topChar, middleChars, bottomChars, lcdDigit, width, height);
		}

		lcdDigits.add(lcdDigit);
	}

	private void processLCDDigit(String topChar, String[] middleChars, String[] bottomChars, String[] lcdDigit,
			int width, int height) {
		processLCDDigitTop(topChar, lcdDigit, width);
		processLCDDigitMiddle(middleChars[0], middleChars[1], middleChars[2], lcdDigit, width, height);
		processLCDDigitBottom(bottomChars[0], bottomChars[1], bottomChars[2], lcdDigit, width, height);
	}

	private void processLCDDigitTop(String character, String[] lcdDigit, int width) {
		String line = " ";
		for (int i = 0; i < width; i++) {
			line += character;
		}
		line += " ";
		lcdDigit[0] = line;
	}

	private void processLCDDigitBottom(String leftChar, String rightChar, String bottomChar, String[] lcdDigit,
			int width, int height) {
		String[] chars = { leftChar, rightChar, bottomChar };
		processLCDDigitPart(height + 2, getRowNumber(height) - 1, width, lcdDigit, chars);
	}

	private void processLCDDigitMiddle(String leftChar, String rightChar, String bottomChar, String[] lcdDigit,
			int width, int height) {
		String[] chars = { leftChar, rightChar, bottomChar };
		processLCDDigitPart(1, height + 1, width, lcdDigit, chars);
	}

	private void processLCDDigitPart(int start, int end, int width, String[] lcdDigit, String[] chars) {
		if (chars.length < 3) {
			return;
		}

		String leftChar = chars[0];
		String rightChar = chars[1];
		String bottomChar = chars[2];
		for (int i = start; i <= end - 1; i++) {
			String line = leftChar;
			for (int j = 0; j < width; j++) {
				line += " ";
			}
			line += rightChar;
			lcdDigit[i] = line;
		}

		String lastLine = " ";
		for (int i = 0; i < width; i++) {
			lastLine += bottomChar;
		}
		lastLine += " ";
		lcdDigit[end] = lastLine;
	}

	private int getRowNumber(int height) {
		return 2 * height + 3;
	}

}
