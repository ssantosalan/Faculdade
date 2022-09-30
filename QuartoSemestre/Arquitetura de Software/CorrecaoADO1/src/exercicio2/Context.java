package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Context {

	public static void main(String[] args) {
		var orcamento = new Orcamento();
		List<Produto> lista = new ArrayList<>();
		lista.add(new Produto("X", 1.2));
		lista.add(new Produto("Y", 1.3));
		lista.add(new Produto("Z", 1.4));
		orcamento.setLista(lista);
		double valorTotal = orcamento.calcularTotal();
		System.out.println("Total: " + orcamento.calcularTotal());
		double valorImposto = Impostos.values()[1].instance().calcular(orcamento);
		System.out.println("Valor imposto: " + valorImposto);
		System.out.println("Orçamento: " + (valorTotal + valorImposto));
	}

}
