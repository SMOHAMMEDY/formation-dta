package herittage.exp;

public abstract class Collaborateur {
    
    private String nom;
    private String prenom;
    private String matricule;
    
    public Collaborateur(String nom, String prenom, String matricule) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }
    
    public void annoncerSalaire() {
        System.out.println("Salaire : " + calculerSalaire());
    }
    
    protected abstract double calculerSalaire();
}