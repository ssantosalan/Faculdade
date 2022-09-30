package exercicio2;

public enum Impostos implements Strategy {
	IP1 {
		@Override
		public Strategy instance() {
			return new Ip1();
		}

		@Override
		public double calcular(Orcamento orcamento) {
			// TODO Auto-generated method stub
			return 0;
		}

	},
	IP2 {
		@Override
		public Strategy instance() {
			return new Ip2();
		}
	},
	IP3 {
		@Override
		public Strategy instance() {
			return new Ip3();
		}

	};

	public abstract Strategy instance();
}
