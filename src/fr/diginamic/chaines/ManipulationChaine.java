package fr.diginamic.chaines;

import entites.Personne;
import fr.diginamic.banque.entites.Compte;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5"; 
		
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);

		System.out.println("la langueur est : " + chaine.length());

		System.out.println("l'index est : " +  chaine.indexOf(';'));

		System.out.println("le nom de famille est : " +  chaine.substring(0, 6));

		System.out.println("le nom de famille est : " +  chaine.substring(0, 6).toUpperCase());

		System.out.println("le nom de famille est : " +  chaine.substring(0, 6).toLowerCase());
		
		String[] arrOfStr = chaine.split(";");

        for (String a : arrOfStr) {
		System.out.println(a );
        }
        
		Personne p = new Personne(arrOfStr[0], arrOfStr[1]);
		Compte c = new Compte(arrOfStr[2], Double.parseDouble(arrOfStr[3].replace(" ", "")));

		System.out.println(p + " - " + c);
	}

}
