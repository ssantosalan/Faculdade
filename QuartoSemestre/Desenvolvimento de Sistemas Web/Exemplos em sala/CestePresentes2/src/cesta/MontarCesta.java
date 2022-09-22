package cesta;

import cestaComposite.Component;
import cestaComposite.Composite;
import cestaComposite.Leaf;

public class MontarCesta {

	public static void main(String[] args) {
		Composite cesta = new Composite("Ceste de presente");

		Component prod1 = new Leaf("Café", 18.98);
		Component prod2 = new Leaf("Leite", 5.98);

		Component prod3 = new Leaf("Bombom", 5.98);
		Component prod4 = new Leaf("bommau", 5.98);

		Composite caixa1 = new Composite("Caixa de bombons");

		caixa1.adicionar(prod3);
		caixa1.adicionar(prod4);
		cesta.adicionar(prod1);
		cesta.adicionar(prod2);
		
		System.out.println(cesta.getPreco());
		System.out.println(cesta);

	}

}
