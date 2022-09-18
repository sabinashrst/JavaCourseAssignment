//Assignment: 3.1
//Author: Sabina Shrestha

public class Customer {

	//name of a customer
    private String name;
    
    //address of a customer. 
    private String address;
    
    //city of a customer
    private String city;
    
    // zip code of a customer
    private String zip;

    public Customer() {
    }

    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Name: " + getName() + "\n" + "Address: " + getAddress() + ".\n" + "City: " + getCity() + "\n" + "Zip: " + getZip();
    }
}