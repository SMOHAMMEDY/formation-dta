package pizzeria.objet.tp.service;

import pizzeria.objet.tp.model.Pizza;

public interface Stockage {
	Pizza[] findAllPizzas();

	void savePizza(Pizza newPizza);
}
