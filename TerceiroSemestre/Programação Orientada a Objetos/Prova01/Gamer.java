package pacote;

public class Gamer extends Pessoa {
    private String jogoJogado;

    public void jogarJogo() {
        System.out.println("JOGANDO " + this.getJogoJogado());
    }

    // Construtor
    public Gamer() {}
    public Gamer(String nome, String sexo, int idade, String jogoJogado) {
        super(nome, sexo, idade);
        this.jogoJogado = jogoJogado;
    }

    public String getJogoJogado() {
        return jogoJogado;
    }

    public void setJogoJogado(String jogoJogado) {
        this.jogoJogado = jogoJogado;
    }
}
