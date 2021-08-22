
import service.LCDDisplayService;

public class Question1 implements LCDDisplayQuestion {

	public static void main(String[] args) {

		LCDDisplayService lcdDisplayService = new LCDDisplayService();

		int number = 123456789;
		LCDDisplayQuestion.displayNumberToLCD(number, 1, 1, lcdDisplayService);
		System.out.println();

		number = 987654321;
		LCDDisplayQuestion.displayNumberToLCD(number, 1, 1, lcdDisplayService);
		System.out.println();

		number = 102030405;
		LCDDisplayQuestion.displayNumberToLCD(number, 1, 1, lcdDisplayService);
		System.out.println();
	}

}
