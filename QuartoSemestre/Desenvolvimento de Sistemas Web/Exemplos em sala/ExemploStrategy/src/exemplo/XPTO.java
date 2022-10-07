package exemplo;

public class XPTO implements Empresa{
	@Override
	public double operacao(Distancia distancia) {
		
		return distancia.getValor() * 0.3;
	}
	
}
