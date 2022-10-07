package exemplo;

public enum ListaEmpresas implements Empresa {
	
	
	
	ABC {

		@Override
		public double operacao(Distancia distancia) {
			// TODO Auto-generated method stub
			return distancia.getValor() * 0.1;
		}

	},
	CBA {

		@Override
		public double operacao(Distancia distancia) {
			// TODO Auto-generated method stub
			return distancia.getValor() * 0.2;
		}

	},
	XPTO {

		@Override
		public double operacao(Distancia distancia) {
			// TODO Auto-generated method stub
			return distancia.getValor() * 0.3;
		}

	};
}
