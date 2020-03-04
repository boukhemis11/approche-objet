package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {

	public static void main(String[] args) {
		Compte cpt = new Compte("1223423A", 1860.90);
		System.out.println(cpt);
	}

}
