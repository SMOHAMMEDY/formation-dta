package fr.pizzeria.model;

public class PizzaApp {

    public static void main(String[] args) {
        // cas méthode d'instance
        Pizza objetPizza = new Pizza();
        objetPizza.setPrix(12);
        objetPizza.setNom("Ma Pizza");
        
        double resultatInstance = objetPizza.doublerPrixInstance();
        
        // cas méthode static

        double resultatStatic = Pizza.doublerPrixStatic(objetPizza.getPrix());
        
        System.out.println(resultatInstance);
        System.out.println(resultatStatic);

        
    }

}