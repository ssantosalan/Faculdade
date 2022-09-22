package cestaComposite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private List<Component> lista = new ArrayList<>();
	private String nome;

	public Composite() {
	}

	public Composite(String nome) {
		this.nome = nome;
	}

	public void adicionar(Component comp) {
		lista.add(comp);
	}

	public void remover(Component comp) {
		lista.remove(comp);
	}

	@Override
	public double getPreco() {
		double total = 0;
		for (Component c : lista) {
			total += c.getPreco();
		}
		return total;

	}

	@Override
	public String toString() {
		return "Composite [lista=" + lista + ", nome=" + nome + "]";
	}

	

	

}
