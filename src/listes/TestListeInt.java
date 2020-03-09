package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> liste = new ArrayList();

		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);
		System.out.println(liste + "\n"); // Affiche la liste

		System.out.println("La taille de la liste" + liste.size());
		
		Integer min = liste.get(0);
		Integer max = liste.get(0);

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) > max) {
				max = liste.get(i);
			}
		}
	    System.out.println("le max est : "+max); // Affiche l'élément le plus grand de la

			for (int i = 0; i < liste.size(); i++) {
				if (liste.get(i) < min) {
					min = liste.get(i);
				}
			}
		System.out.println("le min est : "+min); // Affiche l'élément le plus grand de la
	
		
		liste.remove(min); // Supprime l'élément le plus petit
		System.out.println(liste);

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i) < 0) {
				liste.set(i, liste.get(i) * -1); // Remplace tous les éléments
													// négatif en positif
			}
		}
		System.out.println(liste);
	}

	}

