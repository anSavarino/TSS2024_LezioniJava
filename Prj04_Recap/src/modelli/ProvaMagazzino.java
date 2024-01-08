package modelli;

public class ProvaMagazzino {

	public static void main(String[] args) {
		Magazzino m = new Magazzino();
		
		Prodotto p1 = new Prodotto("Pennarello", "pennarello blu", 2);
		m.addProdotto(p1, 0);
		Prodotto p2 = new Prodotto("Penna", "penna blu", 1);
		m.addProdotto(p2, 1);
		Prodotto p3 = new Prodotto("Gomma", "gomma da cancellare", 0.5);
		m.addProdotto(p3, 2);

		
		m.stampaProdotto();
	}

}
