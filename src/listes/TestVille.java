package listes;

import java.util.ArrayList;

public class TestVille {

	public static void main(String[] args) {
		ArrayList<Ville> liste = new ArrayList();

		Ville Nice = new Ville("Nice", 343_000);
		Ville Caracassonne = new Ville("Carcassonne", 47_800);
		Ville Narbonne = new Ville("Narbonne", 53_400);
		Ville Lyon = new Ville("Lyon", 484_000);
		Ville Foix = new Ville("Foix", 9_700);
		Ville Pau = new Ville("Pau", 77_200);
		Ville Marseille = new Ville("Marseille", 850_700);
		Ville Tarbes = new Ville("Tarbes", 40_600);

		liste.add(Nice);
		liste.add(Caracassonne);
		liste.add(Narbonne);
		liste.add(Lyon);
		liste.add(Foix);
		liste.add(Pau);
		liste.add(Marseille);
		liste.add(Tarbes);

		int nbMax = liste.get(0).getNb();
		int nbMin = liste.get(0).getNb();
		Ville index = liste.get(0);
		String ville = liste.get(0).getNom();

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNb() > nbMax) {
				ville = liste.get(i).getNom();
				nbMax = liste.get(i).getNb();
			}
		}
		System.out.println("la ville la plus peuplée est : "+ville); // Affiche la ville la plus peuplée

		// Iterator<Ville> iter = liste.iterator();

		for (int i = 0; i < liste.size(); i++) {
			if (liste.get(i).getNb() < nbMin) {
				index = liste.get(i);
				nbMin = liste.get(i).getNb();
			}
		}
		liste.remove(index); // Supprime la ville la moins peuplée

		for (int i = 0; i < liste.size(); i++) {
			String Upper = liste.get(i).getNom();
			if (liste.get(i).getNb() > 100_000) {
				Upper = liste.get(i).getNom().toUpperCase();
			}
			System.out.println(Upper); // Affiche les villes en maj si nb > 100
										// 000
		}

	}

}
