package patternState;

public class Esperando implements State {
	private final String nome = "Esperando";
	private Context tarefa;

	public Esperando(Context tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public void abaixando() {
		tarefa.setEstado(new Abaixando(tarefa));

	}

	@Override
	public void correndo() {
		tarefa.setEstado(new Correndo(tarefa));

	}

	@Override
	public void pulando() {
		tarefa.setEstado(new Pulando(tarefa));

	}

	@Override
	public void esperando() {
		System.out.println("Já está esperando");

	}

	@Override
	public String toString() {
		return "Nome estado: " + nome;
	}

}
