package pizzeria.objet.tp;

import java.util.Scanner;

import pizzeria.objet.tp.ihm.Menu;
import pizzeria.objet.tp.service.Stockage;
import pizzeria.objet.tp.service.StockageTableau;

public class App {

	public static void main(String[] args) {

		// Objectif 1 - Afficher le menu
		// Objectif 2 - Récupérer la saisie

		Scanner scanner = new Scanner(System.in);

		Stockage stockage = new StockageTableau(); // je choisi le stockage
													// tableau

		Menu menuPrincipal = new Menu(stockage);
		menuPrincipal.start(scanner);

		scanner.close();

	}

}