package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

    public static void afficher(Forme f) {
		
    	System.out.println("P�rim�tre : " + f.calculerPerimetre() + " - Surface : " + f.calculerSurface());
    	
    }

}
