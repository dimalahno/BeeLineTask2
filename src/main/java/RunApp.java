import java.util.Scanner;

public class RunApp {
	public static void main(String[] args) {
		SignsOfNumber sumOfDigits = new SignsOfNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number:");
		int number = scanner.nextInt();
		System.out.println("The sum of number signs is:");
		System.out.println(sumOfDigits.sumOfSigns(number));
		scanner.close();
	}
}
