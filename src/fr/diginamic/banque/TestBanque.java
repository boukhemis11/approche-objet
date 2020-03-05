package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte cpt = new Compte("1223423A", 1860.90);
		CompteTaux cpt2 = new CompteTaux("1223423A", 1860.90, 0.2);
		
		Compte [] array = {cpt,cpt2};
		
		for (Compte cpte : array) {
			System.out.println(cpte);
		}
	}

}
