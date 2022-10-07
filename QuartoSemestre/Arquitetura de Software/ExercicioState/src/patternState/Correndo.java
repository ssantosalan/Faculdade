package patternState;

public class Correndo implements State {
	private final String nome = "Correndo";
	private Context tarefa;

	public Correndo(Context tarefa) {
		this.tarefa = tarefa;
	}
	
	@Override
	public void abaixando() {
		tarefa.setEstado(new Abaixando(tarefa));
		
	}

	@Override
	public void correndo() {
		System.out.println("Já estou correndo");
		
	}

	@Override
	public void esperando() {
		tarefa.setEstado(new Esperando(tarefa));
		
	}

	@Override
	public void pulando() {
		tarefa.setEstado(new Pulando(tarefa));
		
	}
	
	@Override
	public String toString() {
		return "Novo estado " + nome;
	}

}
