package pattern;

// Subject - Observável
public interface InterfaceNaveJogador {
	public void adicionarObservador(InterfaceNaveInimiga navi);
	
	public void adicionarAcoes(Acoes acao);

	public void notificar();

}
