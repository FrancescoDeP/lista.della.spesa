package lista.della.spesa;

public class Sapone extends Prodotto{

	private double ph;
	
	public Sapone() {
		
	}
	
	public Sapone(double quantita, double prezzo, double ph) {
		super(quantita, prezzo);
		this.ph = ph;
	}

	public double getPh() {
		return ph;
	}

	public void setPh(double ph) {
		this.ph = ph;
	}
	
	@Override
	public String toString() {
		return "Sapone" + "\n" + super.toString() + "PH: " + ph;
	}
}
