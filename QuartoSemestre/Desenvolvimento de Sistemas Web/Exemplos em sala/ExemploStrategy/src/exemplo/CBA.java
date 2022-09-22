package exemplo;

public class CBA  implements Empresa{
	@Override
	public double operacao(Distancia distancia) {
		
		return distancia.getValor() * 0.2;
	}

}
