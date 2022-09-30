import java.util.Scanner;

public class ValidatorIO {

	public static int getInt(Scanner sc, String prompt) {
		int input = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);

			if (sc.hasNext()) {
				input = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid integer value.\n");
			}
			sc.nextLine();
		}
		return input;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double input = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);

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

	public static String getString(Scanner sc, String prompt) {
		String input = "";
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);

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
