package strategy;

public class ICMS implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getPreco() * 0.1;
	}
	
}
