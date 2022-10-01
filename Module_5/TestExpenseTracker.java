//Assignment: 5.2
//Author: Sabina Shrestha

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {

	public static void main(String[] args) {
		
		String result = "y";

		//Display a menu to the user 
		System.out.println("Welcome to the Expense Tracker");
		System.out.println();
		System.out.println("MENU OPTIONS");
		System.out.println("  1. View Transactions");
		System.out.println("  2. Add Transactions");
		System.out.println("  3. View Expense");
		System.out.println();
		
		while (result.equalsIgnoreCase("y")) {

		Scanner sc = new Scanner(System.in); // Create a Scanner object
		int input = ValidatorIO.getInt(sc, "Please choose an option:");

		System.out.println();

		//If the user selects menu item one, display all the transactions in the expenses.txt file
		if (input == 1) {
			try {
				System.out.println("MONTHLY EXPENSES");

				ArrayList<Transaction> transactions = TransactionIO.findAll();
				for (Transaction transaction : transactions) {
					System.out.println("\n"+transaction);
				}
			} catch (IOException e) {
				System.out.println("\n Exception: " + e.getMessage());
			}

		} else if (input == 2) { //If the user selects menu item two, allow the user to add a new transaction to the expenses.txt file.
			String c = "y";
			ArrayList<Transaction> transactions = new ArrayList<>();

			while (c.equalsIgnoreCase("y")) {
				String description = ValidatorIO.getString(sc, "Enter the description: ");
				double amount = ValidatorIO.getDouble(sc, "Enter the amount: ");

				Transaction transaction = new Transaction(description, amount);
				transactions.add(transaction);

				c = ValidatorIO.getString(sc, "\nAdd another transaction? (y/n): ");
			}

			try {
				TransactionIO.bulkInsert(transactions);
			} catch (IOException e) {
				System.out.println("\n Exception: " + e.getMessage());
			}

		} else if (input == 3) { //If the user selects menu item three, display the total expenses of all transactions in the expenses.txt file.
			try {
				double monthlyExpense = 0;
				ArrayList<Transaction> transactions = TransactionIO.findAll();
				for (Transaction transaction : transactions) {
					monthlyExpense += transaction.getAmount();
				}

				System.out.printf("Your total monthly expense is " +  "$%6.2f", monthlyExpense);
				System.out.println();

			} catch (IOException e) {
				System.out.println("\n Exception: " + e.getMessage());
			}
		}
		
		Scanner scan = new Scanner(System.in);	
		System.out.print("\nContinue? (y/n): ");
		result = scan.nextLine();
		System.out.println();
		}
		
		System.out.println("Program terminated by the user...");
	}

}
