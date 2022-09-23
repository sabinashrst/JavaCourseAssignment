//Assignment: 4.2
//Author: Sabina Shrestha
public class Ball extends Product {

	//string data field named color that specifies the color of a bowling ball.
	private String color = "";

	public Ball() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Color: " + getColor();
	}

}
