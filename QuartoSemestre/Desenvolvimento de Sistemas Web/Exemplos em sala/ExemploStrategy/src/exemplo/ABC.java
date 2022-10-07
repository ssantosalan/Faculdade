package exemplo;

public class ABC implements Empresa{

	@Override
	public double operacao(Distancia distancia) {
		
		return distancia.getValor() * 0.1;
	}

}
