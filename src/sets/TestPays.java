package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestPays {

	public static void main(String[] args) {
		Set<Pays> pays = new HashSet<>();
		ArrayList<Pays> py = new ArrayList();

		Pays usa = new Pays("Usa", 325_000_000, 57_638);
		Pays france = new Pays("France", 67_000_000, 43_551);
		Pays allemagne = new Pays("Allemagne", 87_000_000, 50_206);
		Pays uk = new Pays("Uk", 66_000_000, 43_620);
		Pays italie = new Pays("Italie", 60_000_000, 37_970);
		Pays japon = new Pays("Japon", 126_000_000, 42_659);
		Pays chine = new Pays("Chine", 1_300_000_000, 16_624);
		Pays russie = new Pays("Russie", 144_000_000, 27_900);
		Pays inde = new Pays("Inde", 1_349_000_000, 7_174);

		pays.add(usa);
		pays.add(france);
		pays.add(allemagne);
		pays.add(uk);
		pays.add(italie);
		pays.add(japon);
		pays.add(chine);
		pays.add(russie);
		pays.add(inde);

		py.addAll(pays);

		for (Pays test : py) {
			System.out.println(test.getPays());
		}
		System.out.println("\n");

		Pays pSup = null;
		double pib = pays.iterator().next().getPib();
		double pibTot = pays.iterator().next().getPib() * pays.iterator().next().getNbHab();
		String nomP = "";

		for (Pays pibH : pays) {
			if (pib < pibH.getPib()) {
				nomP = pibH.getPays();
			}
		}
		System.out.println("le pays avec le PIB/habitant le plus important est : " + nomP); // PIB/hab le plus grand
		System.out.println("\n");
		for (Pays pibT : pays) {
			if (pibTot > pibT.getNbHab() * pibT.getPib()) {
				nomP = pibT.getPays();
			}
		}
		System.out.println("le pays avec le PIB total le plus important est : " +nomP);
		System.out.println("\n");

		pibTot = pays.iterator().next().getPib() * pays.iterator().next().getNbHab();

		for (Pays pibT : pays) {
			if (pibTot < pibT.getNbHab() * pibT.getPib()) {
				pibTot = pibT.getNbHab() * pibT.getPib();
				nomP = pibT.getPays().toUpperCase();
				pibT.setPays(nomP);
				pSup = pibT;
			}
		}
		System.out.println("le pays avec le PIB total le plus petit est : " +nomP);

		pays.remove(pSup);

		for (Pays affPay : pays) {
			 System.out.println("\n" + affPay.getPays() + " nombre d'habitant: " + affPay.getNbHab() + " PIB totale : "
			 + (affPay.getPib() * affPay.getNbHab()));
		}

	}

}
