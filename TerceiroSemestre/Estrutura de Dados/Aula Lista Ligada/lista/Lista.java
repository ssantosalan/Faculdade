package lista;
/*
 Escreva um método para pesquisar por ID, na lista ligada.
 Incluia o atributo ID e recursos necessários na classe Carro.
 Assinatura do método pesquisar: public Carro pesquisar(int id);
 */

public class Lista {
	private Elemento inicio = null, atual, aux;

	public void inserir(Object objeto) {
		if (inicio == null) {
			inicio = new Elemento(objeto, null);
			aux = inicio;
		} else {
			atual = new Elemento(objeto, null);
			aux.setProx(atual);
			aux = atual;
		}
	}

	public Carro pesquisarId(int id) {
		Elemento x = inicio;
		Carro c;
		while (x != null) {
			c = (Carro) x.objeto;
			if (id == c.getId()) {
				return c;
			}
			x = x.prox;
		}
		return null;
	}

	public void exibir() {
		Elemento x = inicio;
		while (x != null) {
			System.out.println(x.getObjeto());
			x = x.getProx();
		}
	}

	private Elemento[] pesquisarRemove(int id) {
		Elemento x = inicio, auxRem = null;
		Elemento[] v = { x, auxRem };
		Carro c;
		while (x != null) {
			c = (Carro) x.getObjeto();
			if (id == c.getId()) {
				v[0] = x;
				v[1] = auxRem;
				return v;
			}
			auxRem = x;
			x = x.getProx();
		}
		return null;
	}

	public boolean remover(int id) {
		Elemento[] v = pesquisarRemove(id);
		if (v != null) {
			Elemento x = v[0];
			Elemento auxRem = v[1];
			if (x == inicio) {
				inicio = x.getProx();
				x.setProx(null);
				return true;
			} else if (x == atual) {
				atual = auxRem;
				aux = auxRem;
				auxRem.setProx(null);
			} else {
				

			}
			return true;

		}
		return false; // Informa que não removeu

	}

	private class Elemento {
		private Object objeto;
		private Elemento prox;

		public Elemento(Object objeto, Elemento prox) {
			super();
			this.objeto = objeto;
			this.prox = prox;
		}

		public Object getObjeto() {
			return objeto;
		}

		public void setObjeto(Object objeto) {
			this.objeto = objeto;
		}

		public Elemento getProx() {
			return prox;
		}

		public void setProx(Elemento prox) {
			this.prox = prox;
		}

		@Override
		public String toString() {
			return "Elemento [objeto=" + objeto + ", prox=" + prox + "]";
		}
	}

}
