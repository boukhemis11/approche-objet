package sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		Set<String> set = new HashSet();

		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		int nbMaxLettre = set.iterator().next().length();
		String nomP = "";
		
		for(String setP : set) {
			if(setP.length() > nbMaxLettre) {
				 nomP=setP;
			}
		}
		System.out.println("Le pays qui a le plus grand nombre de lettres est : "+nomP);
		
		set.remove(nomP);
		
		System.out.println(set);

	}

}
