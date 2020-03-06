package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {
		Maison m = new Maison();
		m.ajouterPiece(new Chambre(9, 0));
		m.ajouterPiece(new Salon(15, 0));
		m.ajouterPiece(new Wc(2, 0));
		m.ajouterPiece(new Cuisine(8, 0));
		m.ajouterPiece(new SalleDeBain(6, 0));
		m.ajouterPiece(new Chambre(9, 1));
		m.ajouterPiece(new Chambre(9, 1));
		m.ajouterPiece(new Chambre(15, 2));
		
		System.out.println(m);
		System.out.println("Superficie RDC : "+m.superficieEtage(0));
		System.out.println("Superficie 1er étage : "+m.superficieEtage(1));
		System.out.println("Superficie 2eme étage : "+m.superficieEtage(2));
		System.out.println("La superficie total : "+m.superficieTotal());
		
		m.ajouterPiece(null);
		
		System.out.println(m);
		
		m.ajouterPiece(new Salon(-30, 1));
		System.out.println(m);
		
		m.ajouterPiece(new Salon(20, -5));
		System.out.println(m);
		
	}

}
