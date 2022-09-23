package patternState;

public class Context {
	private State estado;

	public Context() {
		estado = new Esperando(this);
	}

	public State getEstado() {
		return estado;
	}

	protected void setEstado(State estado) {
		this.estado = estado;
		System.out.println(getEstado());
	}

	public void abaixar() {
		estado.abaixando();
	}

	public void correr() {
		estado.correndo();
	}

	public void pular() {
		estado.pulando();
	}

	public void esperar() {
		estado.esperando();
	}

}
