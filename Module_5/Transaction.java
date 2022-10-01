//Assignment: 5.2
//Author: Sabina Shrestha

public class Transaction {

	//string data field named date that specifies the date of a transaction
	private String date = "09-30-2022";
	
	//string data field named description that specifies the description of a transaction
	private String description = "";
	
	//double data field named amount that specifies the amount of a transaction.
	private double amount = 0;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Transaction() {
		super();
	}

	public Transaction(String description, double amount) {
		super();
		this.description = description;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Date: " + getDate() + "\n" + "Description: " + getDescription() + "\n" + "Amount: " + String.format("$%6.2f",getAmount());
	}

}
