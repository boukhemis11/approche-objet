package fr.diginamic.testexceptions;

public class TestException {

	public static void main(String[] args) throws Exception {
		try {
			System.out.println(Operation.diviser(8, 2));
			//System.out.println(Operation.diviser(8, 0));
		} catch (Exception e) {
			System.out.println("message :"+e.getMessage());
		}
		

	}

}
