package n1ex01;

public class N1ex01 {

	public static void main(String[] args) throws Exception {
		
		//Codigo en el que el array esta vacio y salta la excepcion.
		Venda venda1 = new Venda();
		venda1.calcularTotal();

		//Codigo si el array no esta vacio y no salta la excepcion.
		/*Venda venda1 = new Venda();

		Producte patates = new Producte("Lay's campesinas", 1.56f);
		Producte refresc = new Producte("Monster MangoLoco", 1.21f);

		venda1.getProductes().add(refresc);
		venda1.getProductes().add(patates);

		venda1.calcularTotal();/*


		// Codigo para provocar IndexOutOfBoundException
		/*
		 ArrayList<String> paraulesFail = new ArrayList<String>();
		 paraulesFail.add("Fail");

		 for(int i = -1; i < paraulesFail.size();i++) {
			 System.out.println(paraulesFail.get(i)); 
		 }
		 */

	}

	}

