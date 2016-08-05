package pizzeria.objet.tp.ihm;

import pizzeria.objet.tp.model.Pizza;
import pizzeria.objet.tp.service.Stockage;

public class ListerPizzasAction extends Action {

	private Stockage stockage;

	public ListerPizzasAction(Stockage stockage) {
		super("Lister les pizzas");
		this.stockage = stockage;
	}

	@Override
	public void execute() {
		System.out.println("*** Lister Pizzas ****");
		Pizza[] pizzas = this.stockage.findAllPizzas();
		for (int i = 0; i < pizzas.length; i++) {
			Pizza p = pizzas[i];
			System.out.println(p.getCode() + " " + p.getNom());
		}

	}

}