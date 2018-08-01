import java.util.Scanner;

public class Main {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("\t\t\t ###################################################### \t\t\t");
		System.out.println("\t\t\t\t\t\t CALCULATOR PROJECT \t\t\t");
		System.out.println("\t\t\t ###################################################### \t\t\t");

		char closer = 'y';
		int res = 0;

		do {
			System.out.println("Enter Two Numbers: ");
			input = new Scanner(System.in);
			int firstNumber = input.nextInt();
			int secondNumber = input.nextInt();

			int tmpFirstNumber = 0, tmpSecondNumber = 0;
			if (firstNumber < secondNumber) {
				tmpFirstNumber = secondNumber;
				tmpSecondNumber = firstNumber;
			} else {
				tmpFirstNumber = firstNumber;
				tmpSecondNumber = secondNumber;
			}

			System.out.println("choose Operations(+, -, *, /): ");
			char operator = input.next().charAt(0);

			switch (operator) {
			case '+':
				res = tmpFirstNumber + tmpSecondNumber;
				System.out.println("Your Result: " + res);
				break;
			case '-':
				res = tmpFirstNumber - tmpSecondNumber;
				System.out.println("Your Result: " + res);
				break;

			case '*':
				res = tmpFirstNumber * tmpSecondNumber;
				System.out.println("Your Result: " + res);
				break;

			case '/':
				if (tmpSecondNumber == 0) {
					System.out.println("Invalid Number!!");
					break;
				} else {
					res = tmpFirstNumber / tmpSecondNumber;
					System.out.println("Your Result: " + res);
					break;
				}

			default:
				System.out.println("Please Enter the proper operator");
				break;

			}

			System.out.println("Do you wanna Another process: y/n?");
			closer = input.next().charAt(0);
			if (closer == 'n') {
				System.out.println("Process Exit !!. Try Again Later.Thanks");
				break;
			}

		} while (closer == 'y');

	}

}
