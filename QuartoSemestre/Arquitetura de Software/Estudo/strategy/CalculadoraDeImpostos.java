package strategy;

public class CalculadoraDeImpostos {
	
	public void calculadora(Orcamento orcamento, Imposto impostoQualquer) {
		double imposto = impostoQualquer.calcular(orcamento);
		System.out.println(imposto);
	}
	
}
