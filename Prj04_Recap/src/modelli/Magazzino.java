package modelli;

public class Magazzino {

	Prodotto[] prodotti = new Prodotto[10];
	
	public void addProdotto(Prodotto p, int pos) {
		prodotti[pos] = p;
	}
	
	public void stampaProdotto() {
		for (Prodotto prodotto : prodotti) {
			if (prodotto!=null) {
				System.out.println(prodotto.nome);
			}
		}
	}
	
	
}
