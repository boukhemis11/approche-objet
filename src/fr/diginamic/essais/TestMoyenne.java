package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 *
 * 
 * @author Boukhemis Dib
 *
 */
public class TestMoyenne {

	public static void main(String[] args) {

		CalculMoyenne c1 = new CalculMoyenne();
		c1.ajout(8.0);
		c1.ajout(4.5);
		c1.ajout(15.0);
		c1.ajout(5.5);
		
		System.out.println(c1);
		
		CalculMoyenne c2 = new CalculMoyenne();
		c2.ajout(5.0);
		c2.ajout(100.0);
		c2.ajout(62.0);


		System.out.println(c2);

	}

}
