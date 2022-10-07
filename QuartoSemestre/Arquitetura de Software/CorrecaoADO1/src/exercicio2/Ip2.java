package exercicio2;

public class Ip2 implements Strategy {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.calcularTotal() * 0.2;
	}

}
