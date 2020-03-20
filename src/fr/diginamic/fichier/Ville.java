/**
 * 
 */
package fr.diginamic.fichier;

public class Ville {

	int codeRegion;

	String nomRegion;

	String codeDepartement;

	String codeCommune;

	String nomCommune;

	int populationTotale;

	public Ville() {

	}

	public Ville(int codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}


	public int getCodeRegion() {
		return codeRegion;
	}


	public String getNomRegion() {
		return nomRegion;
	}


	public String getCodeDepartement() {
		return codeDepartement;
	}


	public String getCodeCommune() {
		return codeCommune;
	}


	public String getNomCommune() {
		return nomCommune;
	}


	public int getPopulationTotale() {
		return populationTotale;
	}


	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}


	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}


	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}


	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}


	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}


	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() {
		return "Ville [ nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement + ", nomCommune=" + nomCommune
				+ ", populationTotale=" + populationTotale + "]";
	}

	@Override
	public int hashCode() {
		final int p = 31;
		int result = 1;
		result = p * result + ((codeCommune == null) ? 0 : codeCommune.hashCode());
		result = p * result + ((codeDepartement == null) ? 0 : codeDepartement.hashCode());
		result = p * result + codeRegion ;
		result = p * result + ((nomCommune == null) ? 0 : nomCommune.hashCode());
		result = p * result + ((nomRegion == null) ? 0 : nomRegion.hashCode());
		result = p * result + populationTotale;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (codeCommune == null) {
			if (other.codeCommune != null)
				return false;
		} else if (!codeCommune.equals(other.codeCommune))
			return false;
		if (codeDepartement == null) {
			if (other.codeDepartement != null)
				return false;
		} else if (!codeDepartement.equals(other.codeDepartement))
			return false;
		if (codeRegion != other.codeRegion)
			return false;
		if (nomCommune == null) {
			if (other.nomCommune != null)
				return false;
		} else if (!nomCommune.equals(other.nomCommune))
			return false;
		if (nomRegion == null) {
			if (other.nomRegion != null)
				return false;
		} else if (!nomRegion.equals(other.nomRegion))
			return false;
		if (populationTotale != other.populationTotale)
			return false;
		return true;
	}
}
