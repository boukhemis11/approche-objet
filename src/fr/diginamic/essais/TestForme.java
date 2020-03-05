package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		AffichageForme.afficher(new Cercle(5.5));
		AffichageForme.afficher(new Rectangle(8, 3));
		AffichageForme.afficher(new Carre(6));

	}

}
