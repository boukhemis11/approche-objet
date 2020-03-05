package entites;

public class Personne {
	public String nom;
	public String prenom;
	public String adressePostale ;
	
	public Personne(String nom,String prenom) {
		this.nom=nom;
		this.prenom=prenom;
	}
	
	public Personne(String nom,String prenom, String adressePostale) {
		this.nom=nom;
		this.prenom=prenom;
		this.adressePostale=adressePostale ;
	}
	
	public void print() {
		System.out.println(nom.toUpperCase());
		System.out.println(prenom);
	}
	
	public String editName(String name) {
		this.nom = name;
		return name;
	}
	
	public String editAdress(String adress) {
		this.adressePostale = adress;
		return adress;
	}

	public String nomRt() {
		return this.nom;
	}
	
	public String prenomRt() {
		return this.prenom;
	}
	
	public String AdressRt() {
		return this.adressePostale;
	}

	@Override
	public String toString() {
		return "nom = " + nom + ", prenom = " + prenom;
	}
	
}
