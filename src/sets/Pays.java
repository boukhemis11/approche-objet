package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Pays {
	private String pays;
	private int nbHab;
	private int pib;

	public Pays(String pays, int nbHab, int pib) {
		this.pays = pays;
		this.nbHab = nbHab;
		this.pib = pib;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}

}
