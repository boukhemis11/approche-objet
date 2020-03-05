package fr.diginamic.essais;
import fr.diginamic.operations.Operations;
public class TestOperations {

	public static void main(String[] args) {
		System.out.println("8 - 2 = " + Operations.calcul(8, 2, '-'));
		System.out.println("3 + 2 = " + Operations.calcul(3, 2, '+'));
		System.out.println("10 / 5 = " + Operations.calcul(10, 5, '/'));
		System.out.println("2 * 2 = " + Operations.calcul(2, 2, '*'));

	}

}
