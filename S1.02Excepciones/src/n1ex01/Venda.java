package n1ex01;

import java.util.ArrayList;

public class Venda {
	private  ArrayList<Producte> productes = new ArrayList<Producte>();


	public  ArrayList<Producte> getProductes() {
		return productes;
	}


	public void calcularTotal() throws VendaBuidaException {

		float sumaPreu = 0;

		if (productes.size() == 0) {
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes!!");
		}
		else {
			for(int i = 0; i < productes.size(); i++) {
				sumaPreu = sumaPreu +  productes.get(i).getPreuVenda();		    	  
			}
			System.out.println(sumaPreu+" Euros.");
		}
	}

}
