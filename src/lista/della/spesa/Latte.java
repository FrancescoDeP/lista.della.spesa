package lista.della.spesa;

public class Latte extends Prodotto{
	
	private String tipo;
	
	public Latte() {
		
	}
	
	public Latte(double quantita, double prezzo, String tipo) {
		super(quantita, prezzo);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Latte" + "\n" + super.toString() + "Tipo: " + tipo;
	}

}
