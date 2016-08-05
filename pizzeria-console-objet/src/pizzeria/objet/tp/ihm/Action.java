package pizzeria.objet.tp.ihm;

public abstract class Action {
    
    private String libelle;
    
    public Action(String libelle) {
		super();
		this.libelle = libelle;
	}
    
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String nouveauLibelle) {
        this.libelle = nouveauLibelle;
    }

    public abstract void execute();
}