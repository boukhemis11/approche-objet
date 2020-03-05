package utils;

import entites.Cercle;

public class CercleFactory {

	public static Cercle creer(double rayon) {

		return new Cercle(rayon);
	}
}
