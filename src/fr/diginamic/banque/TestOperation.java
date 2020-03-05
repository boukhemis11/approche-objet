package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		Credit crd = new Credit("12/11/2019", 300);
		Credit crd1 = new Credit("12/12/2019", 200);
		Debit dbt = new Debit("10/11/2019", 1000);
		Debit dbt1 = new Debit("12/10/2019", 1500);

		Operation [] array = {crd,crd1,dbt,dbt1};
		
		double soldeGlobal = 0.0;
		for (Operation ope : array) {
			System.out.println(ope+ " , " +ope.afficherType());
			if(ope.afficherType().equals("Debit")) {
				soldeGlobal -= ope.getMontant();
			}else {
				soldeGlobal += ope.getMontant();
			}		
		}
		System.out.println(soldeGlobal);
	}

}
