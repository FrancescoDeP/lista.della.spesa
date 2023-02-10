package lista.della.spesa;

public class Prodotto {
	
	private double quantita;
	private double prezzo;

	public Prodotto() {
		
	}
	
	public Prodotto(double quantita, double prezzo) {
		this.quantita = quantita;
		this.prezzo = prezzo;
	}

	public double getQuantita() {
		return quantita;
	}

	public void setQuantita(double quantita) {
		this.quantita = quantita;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return  "Quantità: " + quantita + "\n"
				+ "Prezzo: " + prezzo + "\n";
	}
}
