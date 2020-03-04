package fr.diginamic.banque.entites;

public class Compte {
 private int nbrCmpt;
 private double soldeCmpt;
 
public Compte(int nbrCmpt, double soldeCmpt) {
	this.nbrCmpt = nbrCmpt;
	this.soldeCmpt = soldeCmpt;
}

@Override
public String toString() {
	return "Compte [nbrCmpt=" + nbrCmpt + ", soldeCmpt=" + soldeCmpt + "]";
}
 
 
}
