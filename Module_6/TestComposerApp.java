//Assignment: 6.2
//Author: Sabina Shrestha

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {
	public static void main(String[] args) {

		MemComposerDao memComposerDao = new MemComposerDao();
		int input = userInput();
		while (input != 0) {

			if (input == 1) {
				List<Composer> composers = memComposerDao.findAll();
				for (Composer composer : composers) {
					System.out.println("\n" + composer);
				}
			} else if (input == 2) {
				Scanner idInput = new Scanner(System.in); // Create a Scanner object
				System.out.print("\nEnter an id: ");
				int id = idInput.nextInt();

				Composer composer = memComposerDao.findby(id);
				System.out.println();
				System.out.println();
				System.out.println("--Displaying Customer--");
				System.out.println(composer + "\n");

			} else if (input == 3) {
				Composer composer = new Composer();
				Scanner idInput = new Scanner(System.in); // Create a Scanner object
				System.out.print("\nEnter an id: ");
				int id = idInput.nextInt();
				composer.setId(id);

				Scanner nameInput = new Scanner(System.in); // Create a Scanner object
				System.out.print("Enter a name: ");
				String name = nameInput.nextLine();
				composer.setName(name);

				Scanner genreInput = new Scanner(System.in); // Create a Scanner object
				System.out.print("Enter a genre: ");
				String genre = genreInput.nextLine();
				composer.setGenre(genre);

				memComposerDao.insert(composer);
				System.out.println();
			}

			input = userInput();
		}

	}

	public static int userInput() {
		System.out.println("Welcome to the Composer App");
		System.out.println();
		System.out.println("MENU OPTIONS");
		System.out.println("  1. View Composers");
		System.out.println("  2. Find Composer");
		System.out.println("  3. Add Composer");
		System.out.println("  4. Exit");
		System.out.println();

		Scanner customerInput = new Scanner(System.in); // Create a Scanner object
		System.out.print("Please choose an option:");
		int input = customerInput.nextInt();
		return input;
	}

}
