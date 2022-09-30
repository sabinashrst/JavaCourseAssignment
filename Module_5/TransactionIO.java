import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {

	public static final String FILE_NAME = "expenses.txt";
	private static File file = new File(FILE_NAME);

	public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {

		PrintWriter output = null;

		if (file.exists()) {
			output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
		} else {
			output = new PrintWriter(FILE_NAME);
		}

		for (Transaction tran : transactions) {
			output.print(tran.getDate() + " ");
			output.print(tran.getDescription() + " ");
			output.println(tran.getAmount());

		}

		output.close();

	}
	
	public static ArrayList<Transaction> findAll() throws IOException {

		ArrayList<Transaction> transactions = new ArrayList<Transaction>();
		Transaction tran = new Transaction();
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			tran.setDate(input.next());
			tran.setDescription(input.next());
			tran.setAmount(input.nextDouble());
			transactions.add(tran);			
		}
		
		return transactions ;
	}

}
