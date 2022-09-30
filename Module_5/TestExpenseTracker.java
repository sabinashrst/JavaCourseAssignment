import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {

	public static void main(String[] args) {

		System.out.println("Welcome to the Expense Tracker");
		System.out.println();
		System.out.println("MENU OPTIONS");
		System.out.println("  1. View Transactions");
		System.out.println("  2. Add Transactions");
		System.out.println("  3. View Expense");
		System.out.println();

		Scanner sc = new Scanner(System.in); // Create a Scanner object
		System.out.print("Please choose an option:");
		int input = ValidatorIO.getInt(sc, "MONTHLY EXPENSES");
		System.out.println();

		if (input == 1) {
			try {
				ArrayList<Transaction> transactions = TransactionIO.findAll();
				for (Transaction transaction : transactions) {
					System.out.println(transaction);
				}
			} catch (IOException e) {
				System.out.println("\n Exception: " + e.getMessage());
			}

		} else if (input == 2) {
			String c = "y";
			ArrayList<Transaction> transactions = new ArrayList<>();

			while (c.equalsIgnoreCase("y")) {
				String description = ValidatorIO.getString(sc, "\n Enter the description: ");
				double amount = ValidatorIO.getDouble(sc, " Enter the amout: ");

				Transaction transaction = new Transaction(description, amount);
				transactions.add(transaction);

				c = ValidatorIO.getString(sc, "\n Add another transaction? (y/n): ");

			}

			try {
				TransactionIO.bulkInsert(transactions);
			} catch (IOException e) {
				System.out.println("\n Exception: " + e.getMessage());
			}

		} else if (input == 3) {
			try {
				double monthlyExpense = 0;
				ArrayList<Transaction> transactions = TransactionIO.findAll();
				for (Transaction transaction : transactions) {
					monthlyExpense += transaction.getAmount();
				}

				System.out.print("\n Your total monthly expense is " + monthlyExpense);

			} catch (IOException e) {
				System.out.println("\n Exception: " + e.getMessage());
			}
		}
	}

}
