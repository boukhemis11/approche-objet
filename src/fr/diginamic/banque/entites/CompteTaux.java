package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private double tauxR;

	public CompteTaux(String nbrCmpt, double soldeCmpt, double tauxR) {
		super(nbrCmpt, soldeCmpt);
		this.tauxR = tauxR;

	}

	@Override
	public String toString() {
		return super.toString() + " et le taux de rémunération est : " + tauxR;
	}



}
