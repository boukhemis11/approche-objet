package fr.diginamic.banque.entites;

public class Compte {
 private String nbrCmpt;
 private double soldeCmpt;
 
public Compte(String nbrCmpt, double soldeCmpt) {
	this.nbrCmpt = nbrCmpt;
	this.soldeCmpt = soldeCmpt;
}



public String getNbrCmpt() {
	return nbrCmpt;
}



public void setNbrCmpt(String nbrCmpt) {
	this.nbrCmpt = nbrCmpt;
}



public double getSoldeCmpt() {
	return soldeCmpt;
}



public void setSoldeCmpt(double soldeCmpt) {
	this.soldeCmpt = soldeCmpt;
}



@Override
public String toString() {
	return "N° de compte est : " + nbrCmpt + " et le solde du compte est : " + soldeCmpt + ".";
}
 
 
}
