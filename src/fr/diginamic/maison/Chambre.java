package fr.diginamic.maison;

public class Chambre extends Piece {

	public Chambre(double superficie, int nbrEtage) {
		super(superficie, nbrEtage);

	}
	
	@Override
	public String getType() {

		return "Chambre";
	}

}
