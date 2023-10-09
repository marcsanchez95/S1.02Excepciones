package n1ex01;

public class VendaBuidaException extends Exception {

	private String missatge;

	public VendaBuidaException(String missatge) {
		super(missatge);

	}
	public String getMissatge() {
		return missatge;

	}

}
