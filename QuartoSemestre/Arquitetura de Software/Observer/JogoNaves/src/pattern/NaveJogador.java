package pattern;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject - Objeto observável
public class NaveJogador implements InterfaceNaveJogador {

	private String nome;
	private List<InterfaceNaveInimiga> listaNaveInimiga;
	private List<Acoes> listaAcoes;
	private static int indice = -1;

//	Navax

	public NaveJogador() {
	}

	public NaveJogador(String nome) {
		super();
		this.nome = nome;
		this.listaNaveInimiga = new ArrayList<>();
		this.listaAcoes = new ArrayList<>();
	}

	@Override
	public void adicionarObservador(InterfaceNaveInimiga navi) {
		listaNaveInimiga.add(navi);
	}

	@Override
	public void adicionarAcoes(Acoes acao) {
		listaAcoes.add(acao);
		indice++;
		notificar();
	}

	@Override
	public void notificar() {
		for (InterfaceNaveInimiga navi : listaNaveInimiga) {
			navi.update(listaAcoes.get(indice));
		}
	}

}
