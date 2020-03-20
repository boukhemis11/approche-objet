package fr.diginamic.testexceptions;

public class TestRuntimeException {



	public static void main(String[] args) {
		try {
			System.out.println(diviserRuntime.diviser(8, 2));
			System.out.println(Operation.diviser(8, 0));
			
		} catch (Exception e) {
			System.out.println("message :"+e.getMessage());
		}

	}

}
