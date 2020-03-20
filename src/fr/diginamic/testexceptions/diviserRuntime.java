package fr.diginamic.testexceptions;

public class diviserRuntime extends RuntimeException  {
	public static double diviser(double a , double b)  {
		if(b == 0) {
			throw new DivException ("Il est impossible de diviser par 0");
		}
		
		return a/b;
		
	}
}
