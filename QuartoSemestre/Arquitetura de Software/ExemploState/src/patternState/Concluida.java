package patternState;

public class Concluida implements State {
	private final String nome = "Concluida";
	private Context tarefa;

	public Concluida(Context tarefa) {
		this.tarefa = tarefa;
	}

	@Override
	public void atrasada() {
		System.out.println("Já está concluida");

	}

	@Override
	public void concluida() {
		System.out.println("Já está concluida");

	}

	@Override
	public void pendente() {
		tarefa.setEstado(new Pendente(tarefa));

	}

	@Override
	public String toString() {
		return "Novo estado " + nome;
	}

}
