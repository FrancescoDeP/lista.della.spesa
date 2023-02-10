package lista.della.spesa;

public class ListaDellaSpesa {
	
	
	private Prodotto[] lista;

	
	public ListaDellaSpesa() {
		lista = new Prodotto[3];
	}
	
	private void aumentaLista() {
		Prodotto[] array = new Prodotto[lista.length + 1];
		for(int i=0; i<lista.length; i++) {
			array[i] = lista[i];
		}
		this.lista = array;
	}
	
	public void aggiungiProdotto(Prodotto p) {
		if(lista[lista.length-1] !=  null) {
			aumentaLista();
		}
		for(int i=0; i<lista.length; i++) {
			if(lista[i] == null) {
			lista[i] = p;
			break;
			}
		}
	}
	
	public void stampaLista() {
		for(int i=0; i<lista.length; i++) {
			if(lista[i] != null) {
				System.out.println(lista[i].toString());
				System.out.println("------------------");
			}
		}
	}
}
