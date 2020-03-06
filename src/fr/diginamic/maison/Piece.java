package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int nbrEtage;
	
	public Piece(double superficie, int nbrEtage2) {
		super();
		this.superficie = superficie;
		this.nbrEtage = nbrEtage2;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNbrEtage() {
		return nbrEtage;
	}

	public void setNbrEtage(int nbrEtage) {
		this.nbrEtage = nbrEtage;
	}

	@Override
	public String toString() {
		return "Piece [superficie=" + superficie + ", nbrEtage=" + nbrEtage + "]";
	}
	
	
	
}
