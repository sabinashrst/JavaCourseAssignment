//Assignment: 6.2
//Author: Sabina Shrestha

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements GenericDao<Composer, Integer> {

	private List<Composer> composers = new ArrayList<Composer>();

	public MemComposerDao() {
		Composer comp1 = new Composer();
		comp1.setId(1007);
		comp1.setName("Ludwig Van Beethoven");
		comp1.setGenre("Classical");

		Composer comp2 = new Composer();
		comp2.setId(1008);
		comp2.setName("Johann Sebastian Bach");
		comp2.setGenre("Classical");

		Composer comp3 = new Composer();
		comp3.setId(1009);
		comp3.setName("Wolfgang Amadeus Mozart");
		comp3.setGenre("Classical");

		Composer comp4 = new Composer();
		comp4.setId(1010);
		comp4.setName("Johannes Brahms");
		comp4.setGenre("Classical");

		Composer comp5 = new Composer();
		comp5.setId(1011);
		comp5.setName("Joseph Haydn");
		comp5.setGenre("Classical");

		composers.add(comp1);
		composers.add(comp2);
		composers.add(comp3);
		composers.add(comp4);
		composers.add(comp5);

	}

	// findAll method that returns a list of composer objects.
	@Override
	public List<Composer> findAll() {
		return composers;
	}

	//findBy method that returns a single composer object matching the
	//arguments id
	@Override
	public Composer findby(Integer key) {
		Composer comp = null;
		for (Composer composer : composers) {
			if (composer.getId() == key) {
				comp = composer;
			}
		}
		return comp;
	}

	//insert method that adds a new composer object to the list of composers
	@Override
	public void insert(Composer composer) {
		composers.add(composer);

	}
}
