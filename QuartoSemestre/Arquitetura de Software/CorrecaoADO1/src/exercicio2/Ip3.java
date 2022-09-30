package exercicio2;

public class Ip3 implements Strategy {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.calcularTotal() * 0.4;
	}

}
