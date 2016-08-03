package fr.pizzeria.console;

import java.util.Arrays;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nMenu = 0;
		
		Object [][] listePizzas = {{"PEP","Pépéronie",12.50},
									{"MAR","Margarita",14.50},
									{"REI","La Reine",11.50},
									{"FRO","La 4 Fromages",12.00},
									{"CAN","La Cannibale",12.50},
									{"SAV","La Savoyarde",13.00},
									{"ORI","L'Oriantale",13.50},
									{"IND","L'Indienne",14.00}};
		
	//  faire une boucle  tant que N menu  est diffirent de 99 il réaffiche le menu principal
	do {
	
	// le menu principal
		
		System.out.println ("***** Pizzeria Administration*****\n");
		System.out.println("1.Lister les pizzas");
		System.out.println("2.Ajouter	une	nouvelle pizza");
		System.out.println("3.Mettre à jour une pizza");
		System.out.println("4.Supprimer une pizza");
		System.out.println("99.Sortir");
		
	// afficher le scaner pour introduire les Nmenu
	 nMenu = sc.nextInt();
	
	 // commencer les conditions selon ce qu'on a selectionner comme menu
	 
	  // le menu 1
	 		if (nMenu == 1) {
		
		System.out.println(" « Liste des pizzas » ");
		
			// afficher le tableau liste_pizzas ( pour line par line avec estetique )
		for (int i = 0; i < listePizzas.length; i++) {
	          
	            System.out.println(listePizzas[i][0] + " -> " + listePizzas[i][1] + "(" + listePizzas[i][2] + ")" ); 
			
		}
		
		// le menu 2
	 		} else if (nMenu == 2){

		System.out.println(" « Ajout d’une nouvelle pizza »\n ");
		
		System.out.println("Veuillez saisir le code");
		
		String code = sc.next();
		
		System.out.println("Veuillez saisir le nom (sans espace)");
		
		String nomPizza = sc.next();
		
		System.out.println("Veuillez saisir le prix");
		
		Double prix = sc.nextDouble();
		
			// copie le tableau listePizzas dans un nouveau tableau avec la taille fournie (ici taille de listePizzas +1)
		Object[][] newTab = Arrays.copyOf(listePizzas, listePizzas.length+1); 
		
			// Ajout de la nouvelle pizza à l'index taille listePizzas
		newTab[listePizzas.length] = new Object[]{code, nomPizza, prix}; // [listePizza.lenth]= i = le nombre de ligne de liste pizza qui a l'origine été 8
		 
			// Remplacement de la listePizzas par le nouveau tableau
		listePizzas = newTab;
		
		// le menu 3
		
	 		} else if (nMenu == 3){
		
		System.out.println("« Mise à jour d’une pizza »");
		
			// afficher le tableau liste_pizzas ( pour line par line avec estetique )
		for (int i = 0; i < listePizzas.length; i++) {
	          
	            System.out.println(i + " " + listePizzas[i][0] + " - " + listePizzas[i][1] + "(" + listePizzas[i][2] + ")" ); 
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
		
		// on appel le tableax à la line choisi "index" et on écrase les valeurs de la line avec les variables collecter par le scan 
		
		listePizzas[index] = new Object[]{code, nomPizza, prix};
		
		// afficher le tableau liste_pizzas ( pour line par line avec estetique )
		for (int i = 0; i < listePizzas.length; i++) {
	          
	            System.out.println(listePizzas[i][0] + " -> " + listePizzas[i][1] + "(" + listePizzas[i][2] + ")" ); 
			
		}
		
	 		} else if (nMenu == 4){
		
		System.out.println(" « Suppression d’une pizza »");
		
		// afficher le tableau liste_pizzas ( pour line par line avec estetique )
				for (int i = 0; i < listePizzas.length; i++) {
			          
				System.out.println(i + " " + listePizzas[i][0] + " - " + listePizzas[i][1] + "(" + listePizzas[i][2] + ")" ); 
			   }         
			    
			    System.out.println("\n Veillez choisir le num de la pizza à supprimer");
			    System.out.println("(99	pour abandonner)");
			    
				int index = sc.nextInt();
				
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	 		} else if (nMenu == 99){
		
		System.out.println("« Aurevoir L »");
	
	 		} else { 
		
		System.out.println(" Saisie incorect !! veillez saisir le bon numéro de menu .");
	
	}
	
	}while(nMenu != 99);
	
	}

}
