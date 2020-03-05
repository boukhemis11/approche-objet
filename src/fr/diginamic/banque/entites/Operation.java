package fr.diginamic.banque.entites;

public abstract class Operation {
	/** la date de l'op�ration*/
	private String date;
	/** le montant de l'op�ration */
	private double montant;
	
	public Operation(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	public double getMontant() {
		return montant;
	}

	public abstract String afficherType ();


	@Override
	public String toString() {
		return "date = " + date + " , montant = " + montant+ ", type d'op�ration " + afficherType();
	}
	
	
}
