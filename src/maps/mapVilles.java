package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class mapVilles {

	public static void main(String[] args) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(67, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Iterator i = mapVilles.keySet().iterator();
		
		while (i.hasNext())
		{
			Integer clef = (Integer)i.next();
			String valeur = (String)mapVilles.get(clef);
		    System.out.println(clef);
		}
		
		Iterator it = mapVilles.keySet().iterator();
		
		while (it.hasNext())
		{
			Integer clef = (Integer)it.next();
			String valeur = (String)mapVilles.get(clef);
		    System.out.println(valeur);
		}
		
		System.out.println(mapVilles.size());

	}

}
