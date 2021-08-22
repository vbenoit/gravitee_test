import service.LCDDisplayService;

public class Question2 implements LCDDisplayQuestion {

	public static void main(String[] args) {
		LCDDisplayService lcdDisplayService = new LCDDisplayService();

		int number = 2;
		LCDDisplayQuestion.displayNumberToLCD(number, 3, 2, lcdDisplayService);
		System.out.println();

		number = 1234567890;
		LCDDisplayQuestion.displayNumberToLCD(number, 1, 1, lcdDisplayService);
		System.out.println();

		number = 1234567890;
		LCDDisplayQuestion.displayNumberToLCD(number, 1, 2, lcdDisplayService);
		System.out.println();

		number = 987654321;
		LCDDisplayQuestion.displayNumberToLCD(number, 3, 2, lcdDisplayService);
		System.out.println();

		number = 1020304050;
		LCDDisplayQuestion.displayNumberToLCD(number, 4, 3, lcdDisplayService);
		System.out.println();
	}

}
