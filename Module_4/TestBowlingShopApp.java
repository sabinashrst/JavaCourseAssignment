//Assignment: 4.2
//Author: Sabina Shrestha

import java.util.Scanner;

public class TestBowlingShopApp {

	public static void main(String[] args) {

		String input = "";

		do {
			System.out.println("MENU OPTIONS");
			System.out.println("  1. <b> Bowling Balls");
			System.out.println("  2. <a> Bowling Bags");
			System.out.println("  3. <s> Bowling Shoes");
			System.out.println("  4. <x> To exit");
			System.out.println();
			
			Scanner customerInput = new Scanner(System.in); // Create a Scanner object
			System.out.print("Please choose an option:");
			input = customerInput.nextLine();
			System.out.println();

			GenericQueue<Product> products = ProductDB.getProducts(input);
			if (!(products.size() == 0)) {
				System.out.println("--Product Listing--");
				while (products.size() > 0) {
					System.out.println(products.dequeue());
					System.out.println();
				}
			}
			//Allow the user to keep selecting options until “x” is chosen
		} while (!input.equals("x"));
		System.out.println();
		System.out.println("End of line...");

	}

}
