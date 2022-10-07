package exercicio2;

public class Ip1 implements Strategy {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.calcularTotal() * 0.1;
	}

}
