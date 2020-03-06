package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	
	private int jourTravaille;
	private double montantJournalierRemu;


	public Pigiste(String nom, String prenom, int jourTravaille, double montantJournalierRemu) {
		super(nom, prenom);
		this.jourTravaille = jourTravaille;
		this.montantJournalierRemu = montantJournalierRemu;
	}


	@Override
	public double getSalaire() {
		return montantJournalierRemu * jourTravaille;
	}

	public String getStatut() {

		return "Pigiste";
	}
	
	
}
