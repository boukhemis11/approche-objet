package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	double[] tab = new double[0];
	int ind = 0;

	public CalculMoyenne() {
	}

	
	public void ajout (double a) {

		double[] tmp = new double[tab.length + 1];

		for (int i = 0; i < tmp.length - 1 && tab.length > 0; i++) {
			tmp[i] = tab[i];
		}

		tmp[tmp.length - 1] = a;

		tab = tmp;

	}
	
	public double calcul(double[] array) {
		double moyenne = 0;
		double somme =0;
		int l = array.length;
		
		for(int i=0; i<array.length; i++) {
			somme += array[i];
			moyenne = somme/l;
		}
		
		return moyenne;
		
	}

	@Override
	public String toString() {
		return  Arrays.toString(tab) + ", moyenne = " + calcul(tab) ;
	}
	
	
	
}
