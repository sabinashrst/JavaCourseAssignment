//Assignment: 3.1
//Author: Sabina Shrestha

public class CustomerDB {

	// compare the argument id data field against the values 1007, 1008, and 1009. For each match, return a new customer object with unique fields. If there are no matches, return a default
	//customer object.
    public static Customer getCustomer(Integer id) {

        if (id == 1007) {
            return new Customer("Sam", "1 Test Drive", "Omaha", "68007");
        } else if (id == 1008) {
            return new Customer("Harry", "2 Test Drive", "Licoln", "68147");
        } else if (id == 1009) {
            return new Customer("Pam", "3 Test Drive", "Kearney", "68156");
        } else {
            return new Customer("Nancy", "4 Test Drive", "Omaha", "68985");
        }
    }
}