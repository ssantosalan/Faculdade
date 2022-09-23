package sistema;

import patternState.Context;

public class UsaGame {

	public static void main(String[] args) {
		Context tarefa = new Context();
		System.out.println("Estado atual: " + tarefa.getEstado());
		
		tarefa.abaixar();
		tarefa.correr();
		tarefa.correr();
		tarefa.correr();
	}

}
