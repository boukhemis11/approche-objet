package Inter;

public class Rectangle implements ObjetGeometrique {
	
	private double longueur;
	private double largeur;
	
	

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return (longueur + largeur) * 2;

	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

}
