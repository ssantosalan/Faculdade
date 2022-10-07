package exercicio2;

import java.util.LinkedList;
import java.util.List;

public class Orcamento {
	private List<Produto> lista = new LinkedList<>();

	public List<Produto> getLista() {
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	public double calcularTotal() {
		double total = 0;
		for (Produto p : lista) {
			total += p.getPreco();
		}
		return total;
	}

}
