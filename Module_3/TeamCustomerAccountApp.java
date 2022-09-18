//Assignment: 3.1
//Author: Sabina Shrestha

import java.util.Scanner;

public class TeamCustomerAccountApp {
	public static void main(String[] args) {

		String input = "y";
		Account account = new Account();
		Customer customer;
		
		System.out.println("  Welcome to the Customer Account App");
		System.out.println();

		Scanner customerInput = new Scanner(System.in); // Create a Scanner object
		System.out.println("  Enter a customer ID:");
		System.out.print("    ex: 1007, 1008, 1009>: ");
		int result = customerInput.nextInt(); // Read user input

		customer = CustomerDB.getCustomer(result);
		Scanner displayInput = new Scanner(System.in);
		System.out.println();
		
		//do while loop that takes the user input and based on user input(y/n) continue to loop
		do {
			account.displayMenu();
			String readDisplayInput = displayInput.nextLine();
			System.out.println();

			if (readDisplayInput.equalsIgnoreCase("B")) {
				System.out.println("Account balance: $" + account.getBalance());
			} else if (readDisplayInput.equalsIgnoreCase("D")) {
				Scanner depositAmountInput = new Scanner(System.in); // Create a Scanner object
				System.out.print("Enter deposit amount : ");
				int depositAmount = depositAmountInput.nextInt();
				account.deposit(depositAmount);
				System.out.println();
			} else if (readDisplayInput.equalsIgnoreCase("W")) {
				Scanner withdrawAmountInput = new Scanner(System.in); // Create a Scanner object
				System.out.print("Enter withdraw amount : ");
				int withdrawAmount = withdrawAmountInput.nextInt();
				account.withdraw(withdrawAmount);
				System.out.println();
			} else {
				System.out.println("Error: Invalid Option.");
				System.out.println();
			}

			Scanner scan = new Scanner(System.in); // Create a Scanner object
			System.out.print("Continue? (y/n): ");
			input = scan.nextLine();
			System.out.println();
			System.out.println();

		} while (!input.equals("n"));

		System.out.println();
		System.out.println("--Customer Details--");
		System.out.println(customer);
		System.out.println();
		System.out.printf("Balance as of " + account.getDate() + " is " + "$%6.2f", account.getBalance());
		System.out.println();
		System.out.println("End of line...");

	}
}