package fr.pizzeria.console;

import java.util.Arrays;
import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static Pizza getPizza(int id, String code, String nom, double prix) {

		Pizza p = new Pizza();

		/*
		 * avant p.id = id; p.code = code; p.nom = nom; p.prix =prix;
		 */
		p.setId(id);
		p.setCode(code);
		p.setNom(nom);
		p.setPrix(prix);
		;

		p.nbPizzas++;

		return p;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nMenu = 0;

		Pizza[] listePizzas = { getPizza(0, "PEP", "Pépéronie", 12.50), getPizza(1, "MAR", "Margarita", 14.50),
				getPizza(2, "REI", "La Reine", 11.50), getPizza(3, "FRO", "La 4 Fromages", 12.00),
				getPizza(4, "CAN", "La Cannibale", 12.50), getPizza(5, "SAV", "La Savoyarde", 13.00),
				getPizza(6, "ORI", "L'Oriantale", 13.50), getPizza(7, "IND", "L'Indienne", 14.00) };

		// faire une boucle tant que N menu est diffirent de 99 il réaffiche le
		// menu principal
		do {

			// le menu principal

			System.out.println("***** Pizzeria Administration*****\n");
			System.out.println("1.Lister les pizzas");
			System.out.println("2.Ajouter une nouvelle pizza");
			System.out.println("3.Mettre à jour une pizza");
			System.out.println("4.Supprimer une pizza");
			System.out.println("99.Sortir");

			// afficher le scaner pour introduire les Nmenu
			nMenu = sc.nextInt();

			// commencer les conditions selon ce qu'on a selectionner comme menu

			// le menu 1
			if (nMenu == 1) {

				System.out.println(" « Liste des pizzas » ");

				// afficher le tableau liste_pizzas ( pour line par line avec
				// estetique )
				for (int i = 0; i < listePizzas.length; i++) {

					System.out.println(listePizzas[i].getCode() + " -> " + listePizzas[i].getNom() + "("
							+ listePizzas[i].getPrix() + ")");

				}
				System.out.println("-------" + listePizzas[0].nbPizzas + " "
						+ "pizzas créées depuis l'initialisation du programme");

				// le menu 2
			} else if (nMenu == 2) {

				System.out.println(" « Ajout d’une nouvelle pizza »\n ");

				System.out.println("Veuillez saisir le code");

				String code = sc.next();

				System.out.println("Veuillez saisir le nom (sans espace)");

				String nomPizza = sc.next();

				System.out.println("Veuillez saisir le prix");

				Double prix = sc.nextDouble();

				// copie le tableau listePizzas dans un nouveau tableau avec la
				// taille fournie (ici taille de listePizzas +1)
				Pizza[] newTab = Arrays.copyOf(listePizzas, listePizzas.length + 1);

				// Ajout de la nouvelle pizza à l'index taille listePizzas ( on
				// fais appel à la fonction get pizza)
				newTab[listePizzas.length] = getPizza(newTab[listePizzas.length - 1].getId() + 1, code, nomPizza, prix); // [listePizza.lenth]=
																															// i
																															// =
																															// le
																															// nombre
																															// de
																															// ligne
																															// de
																															// liste
																															// pizza
																															// qui
																															// a
																															// l'origine
																															// été
																															// 8

				// Remplacement de la listePizzas par le nouveau tableau
				listePizzas = newTab;

				// le menu 3

			} else if (nMenu == 3) {

				System.out.println("« Mise à jour d’une pizza »");

				// afficher le tableau liste_pizzas ( pour line par line avec
				// estetique )
				for (int i = 0; i < listePizzas.length; i++) {

					System.out.println(listePizzas[i].getId() + " " + listePizzas[i].getCode() + " - "
							+ listePizzas[i].getNom() + "(" + listePizzas[i].getPrix() + ")");
				}

				System.out.println("\n Veillez choisir le num de la pizza à modifier");
				System.out.println("(99	pour abandonner)");

				int index = sc.nextInt();

				System.out.println("Veuillez saisir le nouveau code");

				String code = sc.next();

				System.out.println("Veuillez saisir le nouveau nom (sans espace)");

				String nomPizza = sc.next();

				System.out.println("Veuillez saisir le nouveau prix");

				Double prix = sc.nextDouble();

				// on appel le tableax à la line choisi "index" et on écrase les
				// valeurs de la line avec les variables collecter par le scan

				listePizzas[index].setCode(code);
				listePizzas[index].setNom(nomPizza);
				listePizzas[index].setPrix(prix);

				// afficher le tableau liste_pizzas ( pour line par line avec
				// esthetique )
				for (int i = 0; i < listePizzas.length; i++) {

					System.out.println(listePizzas[i].getCode() + " -> " + listePizzas[i].getNom() + "("
							+ listePizzas[i].getPrix() + ")");

				}

			} else if (nMenu == 4) {

				System.out.println(" « Suppression d’une pizza »");

				// afficher le tableau liste_pizzas ( pour line par line avec
				// estetique )
				for (int i = 0; i < listePizzas.length; i++) {

					System.out.println(listePizzas[i].getId() + " " + listePizzas[i].getCode() + " - "
							+ listePizzas[i].getNom() + "(" + listePizzas[i].getPrix() + ")");
				}

				System.out.println("\n Veillez choisir le num de la pizza à supprimer");
				System.out.println("(99	pour abandonner)");

				int index = sc.nextInt();

				// copie le tableau listePizzas dans un nouveau tableau avec la
				// taille fournie (ici taille de listePizzas -1)
				Pizza[] newTab = new Pizza[listePizzas.length - 1];

				// parcourir le l'ancien tableau pour remplir le nouveau à
				// l'exception de la pizza supprimée
				for (int i = 0; i < listePizzas.length - 1; i++) {
					if (i < index) {
						newTab[i] = listePizzas[i];
					} else {
						newTab[i] = listePizzas[i + 1];
						// réguler les id après la supprission
						newTab[i].setId(newTab[i].getId() - 1);

					}
				}

				// Remplacement de la listePizzas par le nouveau tableau
				listePizzas = newTab;

			} else if (nMenu == 99) {

				System.out.println("« Aurevoir L »");

			} else {

				System.out.println(" Saisie incorect !! veillez saisir le bon numéro de menu .");

			}

		} while (nMenu != 99);

	}

}
