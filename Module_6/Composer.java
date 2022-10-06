//Assignment: 6.2
//Author: Sabina Shrestha

public class Composer {

	//integer data field named id
	private int id;
	
	// string data field named name
	private String name = "";
	
	// string data field named genre.
	private String genre = "";

	public Composer() {
		super();
	}

	public Composer(int id, String name, String genre) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + "\n" + "Name: " + getName() + "\n" + "Genre: " + getGenre();

	}
}
