package essais;

import entites.AdressePostale;

public class TestAdressePostale {
	
	public static void main(String[] args) {

		AdressePostale adressePostale1 = new AdressePostale();
		AdressePostale adressePostale2 = new AdressePostale();

		adressePostale1.numeroRue = 11;
		adressePostale1.nomRue = "11 suqare notre dame d'Afrique";
		adressePostale1.codePostal = 13010;
		adressePostale1.ville = "Marseille";

		adressePostale2.numeroRue = 15;
		adressePostale2.nomRue = "suqare notre dame d'Afrique";
		adressePostale2.codePostal = 13010;
		adressePostale2.ville = "Marseille";

		System.out.println(adressePostale1);
		System.out.println(adressePostale2);

	}
}
