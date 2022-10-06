//Assignment: 6.2
//Author: Sabina Shrestha

import java.util.List;

public interface GenericDao<E, K> {

	List<E> findAll();

	E findby(K Key);

	void insert(E entity);

}
