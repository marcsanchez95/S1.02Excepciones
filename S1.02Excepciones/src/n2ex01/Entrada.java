package n2ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	public static byte llegirByte(String missatge) {
	Scanner sc = new Scanner(System.in);

	Byte num = 0;
	Boolean correcte = false;

	do {
		try {
			System.out.println(missatge);
			num = sc.nextByte();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("Error de format");
		} finally {
			sc.nextLine();
		}
	} while (!correcte);

	return num;
}

public static int llegirInt(String missatge) {

	Scanner sc = new Scanner(System.in);
	int num = 0;
	Boolean correcte = false;

	do {
		try {
			System.out.println(missatge);
			num = sc.nextInt();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("Error de format");
		} finally {
			sc.nextLine();
		}
	} while (!correcte);

	return num;
}

public static float llegirFloat(String missatge) {

	Scanner sc = new Scanner(System.in);
	float num = 0.2f;
	Boolean correcte = false;

	do {
		try {
			System.out.println(missatge);
			num = sc.nextFloat();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("Error de format, has probat a introduir el numero amb , en comptes de . ? ");
		} finally {
			sc.nextLine();
		}
	} while (!correcte);

	return num;
}

public static double llegirDouble(String missatge) {

	Scanner sc = new Scanner(System.in);
	double num = 0.2;
	boolean correcte = false;

	do {
		try {
			System.out.println(missatge);
			num = sc.nextDouble();
			correcte = true;
		} catch (InputMismatchException e) {
			System.out.println("Error de format");
		} finally {
			sc.nextLine();
		}
	} while (!correcte);

	return num;
}

public static char llegirChar(String missatge) {

	Scanner sc = new Scanner(System.in);
	String caracter;
	char caracter2 = 0;
	boolean correcte = false;

	do {
		try {

			System.out.println(missatge);
			caracter = sc.next();

			if (caracter.length() != 1) {
				throw new Exception("Error de format");
			} else {
				caracter2 = caracter.charAt(0);
				correcte = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.nextLine();
		}
	} while (!correcte);

	return caracter2;
}

public static String llegirString(String missatge) {

	Scanner sc = new Scanner(System.in);
	String paraula = null;
	boolean correcte = false;

	do {
		try {

			System.out.println(missatge);
			paraula = sc.next();
			correcte = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.nextLine();
		}
	} while (!correcte);

	return paraula;
}

public static boolean llegirSiNo(String missatge) {

	Scanner sc = new Scanner(System.in);
	String paraula = null;
	boolean correcte = false;
	boolean siONo = false;

	do {
		try {

			System.out.println(missatge);
			paraula = sc.next();

			if (paraula.length() != 1) {
				throw new Exception("Error de format");
			} else {
				paraula.toLowerCase();
				if (paraula.charAt(0) == 's') {
					siONo = true;
					correcte = true;
				} else if (paraula.charAt(0) == 'n') {
					siONo = false;
					correcte = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.nextLine();
		}
	} while (!correcte);

	return siONo;
}

}
