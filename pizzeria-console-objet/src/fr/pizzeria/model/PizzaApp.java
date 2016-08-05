package fr.pizzeria.model;

public class PizzaApp {

    public static void main(String[] args) {
        // cas m�thode d'instance
        Pizza objetPizza = new Pizza();
        objetPizza.setPrix(12);
        objetPizza.setNom("Ma Pizza");
        
        double resultatInstance = objetPizza.doublerPrixInstance();
        
        // cas m�thode static

        double resultatStatic = Pizza.doublerPrixStatic(objetPizza.getPrix());
        
        System.out.println(resultatInstance);
        System.out.println(resultatStatic);

        
    }

}