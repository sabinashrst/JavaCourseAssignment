// Assignment: 4.2
// Author: Sabina Shrestha
public class ProductDB {

	
	//getProducts with string argument named code and a return type of a product generic queue
	public static GenericQueue<Product> getProducts(String code) {

		GenericQueue<Product> result = new GenericQueue<Product>();

		if (code.equalsIgnoreCase("b")) {

			GenericQueue<Product> balls = new GenericQueue<Product>();
			Ball ball1 = new Ball();
			ball1.setCode("B100");
			ball1.setDescription("Black Widow 2.0");
			ball1.setPrice(144.95);
			ball1.setColor("Black and Red");
			balls.enqueue(ball1);

			Ball ball2 = new Ball();
			ball2.setCode("B200");
			ball2.setDescription("Axiom Pearl");
			ball2.setPrice(154.95);
			ball2.setColor("Blue and Red");
			balls.enqueue(ball2);

			Ball ball3 = new Ball();
			ball3.setCode("B300");
			ball3.setDescription("Proton Physix");
			ball3.setPrice(174.95);
			ball3.setColor("Pink and Purple");
			balls.enqueue(ball3);

			Ball ball4 = new Ball();
			ball4.setCode("B400");
			ball4.setDescription("Force Unleashed");
			ball4.setPrice(139.99);
			ball4.setColor("Red and White");
			balls.enqueue(ball4);

			Ball ball5 = new Ball();
			ball5.setCode("B500");
			ball5.setDescription("Phaze III");
			ball5.setPrice(154.99);
			ball5.setColor("Purple and Green");
			balls.enqueue(ball5);

			result = balls;

		} else if (code.equalsIgnoreCase("s")) {

			GenericQueue<Product> shoes = new GenericQueue<Product>();

			Shoe shoe1 = new Shoe();
			shoe1.setCode("S100");
			shoe1.setDescription("Men's Ram Black");
			shoe1.setPrice(39.99);
			shoe1.setSize(10.5);
			shoes.enqueue(shoe1);

			Shoe shoe2 = new Shoe();
			shoe2.setCode("S200");
			shoe2.setDescription("Women's RIse Black/Hot Pink");
			shoe2.setPrice(39.99);
			shoe2.setSize(7.0);
			shoes.enqueue(shoe2);

			Shoe shoe3 = new Shoe();
			shoe3.setCode("S300");
			shoe3.setDescription("WOmen's Path Lite Seamlsess Mesh");
			shoe3.setPrice(54.99);
			shoe3.setSize(6.0);
			shoes.enqueue(shoe3);

			Shoe shoe4 = new Shoe();
			shoe4.setCode("S400");
			shoe4.setDescription("Men's Tribal White");
			shoe4.setPrice(26.99);
			shoe4.setSize(8.5);
			shoes.enqueue(shoe4);

			Shoe shoe5 = new Shoe();
			shoe5.setCode("S500");
			shoe5.setDescription("Youth Skull Green/Black");
			shoe5.setPrice(39.99);
			shoe5.setSize(3.0);
			shoes.enqueue(shoe5);

			result = shoes;

		} else if (code.equalsIgnoreCase("a")) {
			GenericQueue<Product> bags = new GenericQueue<Product>();

			Bag bag1 = new Bag();
			bag1.setCode("A100");
			bag1.setDescription("Path Pro Deluxe");
			bag1.setPrice(34.99);
			bag1.setType("Single");
			bags.enqueue(bag1);

			Bag bag2 = new Bag();
			bag2.setCode("A200");
			bag2.setDescription("Prime Roller Balck/Royal Blue");
			bag2.setPrice(54.99);
			bag2.setType("Double");
			bags.enqueue(bag2);

			Bag bag3 = new Bag();
			bag3.setCode("A300");
			bag3.setDescription("Silver/Royal Blue");
			bag3.setPrice(74.99);
			bag3.setType("Triple");
			bags.enqueue(bag3);

			result = bags;

		}
		return result;
	}

}
