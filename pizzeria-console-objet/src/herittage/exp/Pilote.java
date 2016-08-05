package herittage.exp;

public class Pilote extends Collaborateur {

    private int nbHeuresVol;
    private double tarifHeureVol;
    
    
    
    public Pilote(String nom, String prenom, String matricule, int nbHeuresVol,
            double tarifHeureVol) {
        super(nom, prenom, matricule);
        this.nbHeuresVol = nbHeuresVol;
        this.tarifHeureVol = tarifHeureVol;
    }

    
    
    protected double calculerSalaire() {
        return nbHeuresVol*tarifHeureVol;
    }
    
    
    
    
    public int getNbHeuresVol() {
        return nbHeuresVol;
    }
    public void setNbHeuresVol(int nbHeuresVol) {
        this.nbHeuresVol = nbHeuresVol;
    }
    public double getTarifHeureVol() {
        return tarifHeureVol;
    }
    public void setTarifHeureVol(double tarifHeureVol) {
        this.tarifHeureVol = tarifHeureVol;
    }
    
}