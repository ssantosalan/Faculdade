package ex02;

public enum Orcamento implements Empresas {

	ip1 {
		@Override
		public double calcularImposto(Imposto imposto, Orcamento empresa) {
			return imposto.getImposto() * 0.1;
		}

	},
	ip2 {
		@Override
		public double calcularImposto(Imposto imposto, Orcamento empresa) {
			return imposto.getImposto() * 0.15;
		}

	},
	ip3 {
		@Override
		public double calcularImposto(Imposto imposto, Orcamento empresa) {
			return imposto.getImposto() * 0.25;
		}
	}
}
