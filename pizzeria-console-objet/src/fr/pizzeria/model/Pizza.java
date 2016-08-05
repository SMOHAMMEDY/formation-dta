package fr.pizzeria.model;

public class Pizza {
    
    private int id;
    private String code;
    private String nom;
    private double prix;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static int nbPizzas;
    
    // constructeur pizza
    
    public Pizza(){
    
    }
    
    public Pizza(String unNom, double unPrix){
    	
    	this.nom =unNom;
    	this.prix = unPrix;
    	
    }
   
    // m�thode d'instance
    public double doublerPrixInstance() {
        return prix*2;
    }
    
    // m�thode static
    public static double doublerPrixStatic(double unPrix) {
        return unPrix*2;
    }

}
