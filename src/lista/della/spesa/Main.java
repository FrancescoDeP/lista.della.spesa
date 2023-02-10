package lista.della.spesa;

public class Main {

	public static void main(String[] args) {
		
		Latte latte = new Latte(1, 1.5, "Soia");
		Pane pane = new Pane(1.5, 2, "Tipo 00");
		Sapone sapone = new Sapone(0.75, 2.50, 4.5);
		
		ListaDellaSpesa lista = new ListaDellaSpesa();
		
		lista.aggiungiProdotto(latte);
		lista.aggiungiProdotto(pane);
		lista.aggiungiProdotto(sapone);
		
		lista.stampaLista();
		
		
		
	}

}
