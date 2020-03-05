package entites;

public class Cercle {
	private double rayon;
	
	public Cercle(double rayon) {

		this.rayon = rayon;
	}

	public double getPerim() {

		return 2 * Math.PI * rayon;
	}

	public double getAir() {

		return Math.PI * rayon * rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
