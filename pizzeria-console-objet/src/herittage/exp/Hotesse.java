package herittage.exp;

public class Hotesse extends Collaborateur {
    
    private double salaire;
    
    
    
    public Hotesse(String nom, String prenom, String matricule, double salaire) {
        super(nom, prenom, matricule);
        this.salaire = salaire;
    }
    
    public double calculerSalaire() {
        return salaire;
    }
   
    
    
    
    
    
    public void montrerConsigneSecurite(){
        System.out.println("Hotesse - Voilà les consignes de sécurité.");
    }
    
    public void servirLesRepas() {
        System.out.println("Hotesse - Voici vos repas.");
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    

}
