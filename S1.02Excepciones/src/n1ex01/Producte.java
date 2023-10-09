package n1ex01;

public class Producte {
	protected String nom;
	protected float preuVenda;
	
	public Producte(String nom, float preuVenda) {
		super();
		this.nom = nom;
		this.preuVenda = preuVenda;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getPreuVenda() {
		return preuVenda;
	}
	public void setPreuVenda(int preuVenda) {
		this.preuVenda = preuVenda;
	}

}

