import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Account {
    private double balance = 200;

    //This method return the balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //This method takes double argument and add that argument in total balance
    public void deposit(double amt) {
        balance += amt;
    }

    //This method decrease the amt from total balance
    public void withdraw (double amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

    public void displayMenu() {
        System.out.println(" Account Menu");
        System.out.println(" Enter <D/d> for deposit");
        System.out.println(" Enter <W/w> for withdraw");
        System.out.println(" Enter <B/b> for balance");
        System.out.print("   Enter option>: ");
    }

    //Return a date using the format MM-dd-yyyy. 
    public String getDate() {
        LocalDate localDate = LocalDate.now();
        Date date = java.sql.Date.valueOf(localDate);
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
        return formatter.format(date);
    }

}