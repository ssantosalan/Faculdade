import pattern.Acoes;
import pattern.InterfaceNaveInimiga;
import pattern.InterfaceNaveJogador;
import pattern.NaveInimiga;
import pattern.NaveJogador;

public class JogoNaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceNaveJogador naveJogador = new NaveJogador("Jogador");
		InterfaceNaveInimiga naveInimiga = new NaveInimiga("Inimigo 1", naveJogador);
		InterfaceNaveInimiga naveInimiga2 = new NaveInimiga("Inimigo 2", naveJogador);
		naveJogador.adicionarAcoes(Acoes.VIRAR_DIREITA);
		naveJogador.adicionarAcoes(Acoes.VIRAR_ESQUERDA);
		naveJogador.adicionarAcoes(Acoes.AVANCAR);
	}

}
