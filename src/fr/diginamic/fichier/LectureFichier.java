package fr.diginamic.fichier;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;



public class LectureFichier {

	public static void main(String[] args) {
File file = new File("C:/temp/recensement population 2016.csv");
		
		try {
			
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0);
			ArrayList<Ville> villes = new ArrayList<Ville>();
			
			for (int i = 1; i < lignes.size(); i++) {
				String ligne = lignes.get(i);

				String[] morceaux = ligne.split(";");
				int codeRegion = Integer.parseInt(morceaux[0]);
				String nomRegion = morceaux[1];
				String codeDepartement = morceaux[2];
				String codeCommune = morceaux[5];
				String nomCommune = morceaux[6];
				String population = morceaux[7];

				int populationTotale = Integer.parseInt(population.replace(" ", ""));

				Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune,
						populationTotale);

				villes.add(ville);
			}
			
			System.out.println(villes.size());		
			System.out.println(InfoVille(villes , "Montpellier"));
			System.out.println(TotaleHab(villes,"34"));
			System.out.println(MinHab(villes,"34"));		
			System.out.println(Les10MaxHab(villes,"34"));
			System.out.println( Les10MinHab(villes,"34"));		
			System.out.println(FoundTotalHabReg(villes , 94));
			System.out.println(Les10MaxHabR(villes,95));
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	

	public static ArrayList<Ville> Les10MaxHabR (ArrayList<Ville> listeVille, int codeReg)
	{
		ArrayList<Ville> les10VilleMax = new ArrayList<Ville>();
		
		for(Ville laVille : listeVille)									
		{
			if(laVille.getCodeRegion() == codeReg)
			{
				if(les10VilleMax.size() < 10)										
				{
					les10VilleMax.add(laVille);										
				}
				else
				{
					Ville laVilleFaibleDes10 = null;
					for(Ville laVillemax : les10VilleMax)						
					{
						if(laVilleFaibleDes10 == null)								
						{
							laVilleFaibleDes10 = laVillemax;
						}
						else
						{
							if(laVillemax.getPopulationTotale() < laVilleFaibleDes10.getPopulationTotale())
							{
								laVilleFaibleDes10 = laVillemax;
							}
						}
					}
					
					if (laVilleFaibleDes10.getPopulationTotale() < laVille.getPopulationTotale())		
					{
						les10VilleMax.remove(laVilleFaibleDes10);
						les10VilleMax.add(laVille);
					}
				}
			}
		}
		return les10VilleMax;
	}
	

	public static ArrayList<Ville> Les10MinHab (ArrayList<Ville> listeVille, String codeDept)
	{
		ArrayList<Ville> les10VilleMin = new ArrayList<Ville>();
		
		for(Ville laVille : listeVille)											
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				if(les10VilleMin.size() < 10)										
				{
					les10VilleMin.add(laVille);										
				}
				else
				{
					Ville laVilleHauteDes10 = null;
					for(Ville laVillemin : les10VilleMin)							
					{
						if(laVilleHauteDes10 == null)								
						{
							laVilleHauteDes10 = laVillemin;
						}
						else
						{
							if(laVillemin.getPopulationTotale() > laVilleHauteDes10.getPopulationTotale())
							{
								laVilleHauteDes10 = laVillemin;
							}
						}
					}
					
					if (laVilleHauteDes10.getPopulationTotale() > laVille.getPopulationTotale())		
					{
						les10VilleMin.remove(laVilleHauteDes10);
						les10VilleMin.add(laVille);
					}
				}
			}
		}
		return les10VilleMin;
	}
	

	public static ArrayList<Ville> Les10MaxHab (ArrayList<Ville> listeVille, String codeDept)
	{
		ArrayList<Ville> les10VilleMax = new ArrayList<Ville>();
		
		for(Ville laVille : listeVille)											
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				if(les10VilleMax.size() < 10)									
				{
					les10VilleMax.add(laVille);									
				}
				else
				{
					Ville laVilleFaibleDes10 = null;
					for(Ville laVillemax : les10VilleMax)						
					{
						if(laVilleFaibleDes10 == null)							
						{
							laVilleFaibleDes10 = laVillemax;
						}
						else
						{
							if(laVillemax.getPopulationTotale() < laVilleFaibleDes10.getPopulationTotale())
							{
								laVilleFaibleDes10 = laVillemax;
							}
						}
					}
					
					if (laVilleFaibleDes10.getPopulationTotale() < laVille.getPopulationTotale())		
					{
						les10VilleMax.remove(laVilleFaibleDes10);
						les10VilleMax.add(laVille);
					}
				}
			}
		}
		return les10VilleMax;
	}
	

	public static Ville MinHab(ArrayList<Ville> listeVille, String codeDept)
	{
		Ville villeMin  = listeVille.get(0);
		
		for(Ville laVille : listeVille)
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				if(laVille.getPopulationTotale() < villeMin.getPopulationTotale())
				{
					villeMin = laVille;
				}
			}
		}
		return villeMin;
	}

	public static int FoundTotalHabReg(ArrayList<Ville> listeVille, int codeReg)
	{
		int totalHabReg = 0;				

		for(Ville laVille : listeVille)
		{
			if(laVille.getCodeRegion() == codeReg)
			{
				totalHabReg += laVille.getPopulationTotale();
			}
		}
		return totalHabReg;
	}
	

	public static int TotaleHab(ArrayList<Ville> listeVille, String codeDept)
	{
		int totalHabHerault = 0;			

		for(Ville laVille : listeVille)
		{
			if(laVille.getCodeDepartement().contentEquals(codeDept))
			{
				totalHabHerault += laVille.getPopulationTotale();
			}
		}
		return totalHabHerault;
	}

	public static Ville InfoVille (ArrayList<Ville> listeVille , String ville )
	{
		Ville villeTrouver = null;
		for(Ville laVille : listeVille)
		{
			if(laVille.getNomCommune().contentEquals(ville))
			{
				villeTrouver = laVille;
			}
		}
		return villeTrouver ;
	}

}
