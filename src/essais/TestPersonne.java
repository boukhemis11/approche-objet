package essais;

import entites.Personne;

public class TestPersonne {
	public static void main(String[] args) {

		Personne personne1 = new Personne("Dib", "Boukhemis");
		Personne personne2 = new Personne("Dib", "Boukhemis");
		Personne personne3 = new Personne("Dib", "wiam", "05 suqare notre dame d'Afrique");
		Personne personne4 = new Personne("Dib", "wiam", "05 suqare notre dame d'Afrique");
		
		System.out.println(personne1);
		System.out.println(personne2);
		System.out.println(personne3);
		System.out.println(personne4);
	}
}
