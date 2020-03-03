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
}
