package n2ex01;

public class N2ex01 {

	public static void main(String[] args) throws Exception {

		Byte num1 = Entrada.llegirByte("Introdueix un numero entre -128 y 127: ");		
		int num2 = Entrada.llegirInt("Introdueix un numero entre -2,147,483,648 y 2,147,483,647:");		
		Float num3 = Entrada.llegirFloat("Introdueix un numero entre -3.402823e38 y 3.402823e38:");		
		double num4 = Entrada.llegirDouble("Introdueix un numero entre -1.79769313486232e308 y 1.79769313486232e308:");		
		char caracter = Entrada.llegirChar("Introdueix un unic caracter del teclat:");
		String paraula = Entrada.llegirString("Introdueix una paraula:");
		boolean siONo = Entrada.llegirSiNo("Introdueix s/n:");

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(caracter);
		System.out.println(paraula);
		System.out.println(siONo);
	}

}

