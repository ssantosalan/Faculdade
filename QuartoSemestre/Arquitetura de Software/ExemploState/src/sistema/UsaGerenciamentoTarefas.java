package sistema;

import patternState.Context;

public class UsaGerenciamentoTarefas {

	public static void main(String[] args) {
		Context tarefa = new Context();
		System.out.println("Estado atual: " + tarefa.getEstado());
		tarefa.requisitarAtrasada();
		tarefa.requisitarAtrasada();
		tarefa.requisitarConcluida();
		tarefa.requisitarPendente();
		tarefa.requisitarPendente();
	}

}
