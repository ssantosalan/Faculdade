package pattern;

public class NaveInimiga implements InterfaceNaveInimiga {
	private String nome;

	public NaveInimiga(String nome, InterfaceNaveJogador navj) {
		super();
		this.nome = nome;
		navj.adicionarObservador(this);
	}

	@Override
	public void update(Acoes acoes) {
		System.out.println(nome + " - Ação: " + acoes);
	}

}
