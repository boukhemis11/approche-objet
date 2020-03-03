package essais;

import entites.AdressePostale;

public class TestAdressePostale {
	
	public static void main(String[] args) {

		AdressePostale adressePostale1 = new AdressePostale(11, "suqare notre dame d'Afrique", 13010, "Marseille");
		AdressePostale adressePostale2 = new AdressePostale(13, "suqare notre dame d'Afrique", 13010, "Marseille");

		System.out.println(adressePostale1);
		System.out.println(adressePostale2);

	}
}
