package lista.della.spesa;

public class Pane extends Prodotto{

	private String farina;
	
	public Pane() {
		
	}
	
	public Pane(double quantita, double prezzo, String farina) {
		super(quantita, prezzo);
		this.farina = farina;
	}

	public String getFarina() {
		return farina;
	}

	public void setFarina(String farina) {
		this.farina = farina;
	}
	
	@Override
	public String toString() {
		return "Pane" + "\n" + super.toString() + "Farina: " + farina;
	}
}
