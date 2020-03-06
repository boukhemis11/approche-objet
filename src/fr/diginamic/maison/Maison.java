package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	
	private Piece[] tab = new Piece[0];
	
	public Maison() {
	}

	public Piece[] ajouterPiece(Piece p) {
		if(p != null && p.getNbrEtage() >= 0 && p.getSuperficie() > 0) {
			Piece[] tmp = new Piece[tab.length + 1];
			for (int i = 0; i < tmp.length - 1 && tab.length > 0; i++) {
				tmp[i] = tab[i];
			}
			tmp[tmp.length - 1] = p;
	
			tab = tmp;
		}else {
			System.out.println("error");
		}
		return tab;
	}
	
	public double superficieTotal() {
		double s=0;
		for (Piece p : tab) {
				s += p.getSuperficie();
		}
		
		return s;
		
	}
	
	public double superficieEtage(int etage) {
		
		double s=0;
		
		for (Piece p : tab) {
			if (p.getNbrEtage() == etage ) {
				s += p.getSuperficie();
	
			}
		}
	
		return s;
		
	}
	
	public double superficieGlobale(String type) {
		double s=0;
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
		for (Piece piece : tab) {

			if (piece.getType().equals(type)) {
				s += piece.getSuperficie();
			}
		}
		
		return s;	
	}
	
	public int nombrePiece(String type) {

		int nbr = 0;
		for (Piece piece : tab) {
			if (piece.getType().equals(type)) {
				nbr++;
			}
		}

		return nbr;
	}	
	

	public Piece[] getTab() {
		return tab;
	}

	public void setTab(Piece[] tab) {
		this.tab = tab;
	}

	@Override
	public String toString() {
		return "Maison [tab=" + Arrays.toString(tab) + ", superficieTotal()=" + superficieTotal() +  "]";
	}



	
}
