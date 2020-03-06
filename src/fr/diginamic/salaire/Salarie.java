package fr.diginamic.salaire;

import fr.diginamic.salaire.Intervenant;;

public class Salarie extends Intervenant {

	private double salaire;

	public Salarie(String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public String getStatut() {
		return "Salarié";	
	}

	@Override
	public double getSalaire() {
		return salaire;
		
	}
	

}
