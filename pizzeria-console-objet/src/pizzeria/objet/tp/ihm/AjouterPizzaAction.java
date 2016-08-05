package pizzeria.objet.tp.ihm;

public class AjouterPizzaAction extends Action {

	public AjouterPizzaAction() {
		super("Ajouter Pizza");
	}

	@Override
	public void execute() {
		System.out.println("Ajout d'une nouvelle pizza");
	}

}