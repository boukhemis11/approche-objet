package essais;

import entites.Personne;

public class TestPersonne {
	public static void main(String[] args) {

		Personne personne1 = new Personne();
		Personne personne2 = new Personne();
	
		personne1.nom = "Dib";
		personne1.prenom = "Boukhemis";
		personne1.adressePostale = "11 suqare notre dame d'Afrique";
	
		personne2.nom = "Dib";
		personne2.prenom = "wiam";
		personne2.adressePostale = "05 suqare notre dame d'Afrique";
		
		System.out.println(personne1);
		System.out.println(personne2);
	}
}
