package pizzeria.objet.tp.ihm;

import java.util.Scanner;

import pizzeria.objet.tp.service.Stockage;

public class Menu {

	private static final int CHOIX_SORTIR = 99;

	private Action[] actions;

	public Menu(Stockage stockage) {
		actions = new Action[] { new ListerPizzasAction(stockage), new AjouterPizzaAction() };
	}

	public void start(Scanner scanner) {
		boolean result = false;
		do {
			afficher();
			result = choisir(scanner);
		} while (!result);

	}

	public void afficher() {
		System.out.println("*** Application Pizzeria ***");

		for (int i = 0; i < actions.length; i++) {
			Action actionEnCours = actions[i];
			String libelleAction = actionEnCours.getLibelle();
			int indexMenu = i + 1;
			System.out.println(indexMenu + ". " + libelleAction);
		}
		System.out.println(CHOIX_SORTIR + ". Quitter");
	}

	public boolean choisir(Scanner scanner) {
		System.out.println("Veuillez choisir une option");
		int choix = scanner.nextInt();

		if (choix <= 0 || choix > actions.length) {
			if (choix != CHOIX_SORTIR) {
				System.out.println("Veuillez nettoyer vos lunettes !! Choisissez une option valide !");
			}
		} else {
			Action laBonneAction = actions[choix - 1];
			laBonneAction.execute();
		}

		return choix == CHOIX_SORTIR;
	}

}