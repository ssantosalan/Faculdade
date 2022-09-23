package patternState;

public class Pulando implements State {
	private final String nome = "Pulando";
	private Context tarefa;

	public Pulando(Context tarefa) {
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
	public void esperando() {
		tarefa.setEstado(new Esperando(tarefa));

	}

	@Override
	public void pulando() {
		System.out.println("Já estou pulando");

	}

	@Override
	public String toString() {
		return "Novo estado " + nome;
	}

}
