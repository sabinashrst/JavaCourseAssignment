//Assignment: 4.2
//Author: Sabina Shrestha
public class Shoe extends Product {

	// double data field named size that specifies the shoe size.
	private double size = 0;

	public Shoe() {
		super();
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Color: " + getSize();
	}

}
