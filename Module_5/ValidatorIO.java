//Assignment: 5.2
//Author: Sabina Shrestha

import java.util.Scanner;

public class ValidatorIO {

	
	//static method named getInt with a Scanner argument named sc and a string argument
	//named prompt and an Integer return type.
	public static int getInt(Scanner sc, String prompt) {
		int input = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);

			if (sc.hasNextInt()) {
				input = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid integer value.\n");
			}
			sc.nextLine();
		}
		return input;
	}

	//static method named getDouble with a Scanner argument named sc and a string
	//argument named prompt and a double return type
	public static double getDouble(Scanner sc, String prompt) {
		double input = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);

			if (sc.hasNextDouble()) {
				input = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid integer value.\n");
			}
			sc.nextLine();
		}
		return input;
	}

	//static method named getString with a Scanner argument named sc and a string
	//argument named prompt and a string return type
	public static String getString(Scanner sc, String prompt) {
		String input = "";
		boolean isValid = false;

		while (!isValid) {
			System.out.print(prompt);

			if (sc.hasNext()) {
				input = sc.next();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid integer value.\n");
			}
			sc.nextLine();
		}
		return input;
	}
}
