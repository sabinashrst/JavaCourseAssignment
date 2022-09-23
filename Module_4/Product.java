//Assignment: 4.1
//Author: Sabina Shrestha
public class Product {

	//string data field named code that specifies the product code.
	private String code = "";
	
	//string data field named description that specifies the products description
	private String description = "";
	
	//double data field named price that specifies the price of a product.
	private double price = 0;

	public Product() {
		super();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product code: " + getCode() + "\n" + "Description: " + getDescription() + ".\n" + "Price: "
				+ getPrice();
	}
}