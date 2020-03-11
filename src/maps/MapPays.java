package maps;

import java.util.HashMap;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		HashMap<String,Pays> map = new HashMap<>();
		
		map.put("USA",new Pays("USA", 20_000, 1000));
		map.put("France",new Pays("France", 10_000, 500));
		map.put("Allemagne",new Pays("Allemagne", 5_000, 400));
		map.put("UK",new Pays("UK", 20_500, 1500));
		map.put("Italie",new Pays("Italie", 250000, 1200));
		map.put("Japon",new Pays("Japon", 30_000, 85));
		map.put("Chine",new Pays("Chine", 210_000, 74));
		map.put("Russie",new Pays("Russie", 100_000, 85));
		map.put("Inde",new Pays("Inde", 220_000, 42));
		
		int minPop = Integer.MAX_VALUE;
		String minPays = "";
		for(String key : map.keySet()) {
			
			Pays current = map.get(key);
			
			if(current.getPib() < minPop) {
				minPop = current.getPib();
				minPays = key;
			}
		}
		System.out.println(minPays);
		
		map.remove(minPays);
		
		System.out.println(map);

	}

}
