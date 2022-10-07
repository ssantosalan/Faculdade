package strategy;

public class ISS implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getPreco() * 0.2;
	}
	
}
