package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {
		
		Pigiste p = new Pigiste("Dib", "Boukhemis", 20, 80); 
		Salarie s = new Salarie("Dib", "Wiam", 2000); 
		
		p.afficherDonnees();
		s.afficherDonnees();

	}

}
