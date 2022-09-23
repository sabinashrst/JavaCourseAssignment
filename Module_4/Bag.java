//Assignment: 4.2
//Author: Sabina Shrestha
public class Bag extends Product {

	//string data field named type that specifies the number of bowling balls the bag can hold
	private String type = "";

	public Bag() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Color: " + getType();
	}

}
