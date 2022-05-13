package pacote;

public class Pessoa {
    private String nome, sexo;
    private int idade;

    // Método
    public void ligarComputador() {
        System.out.println("Ligando o computador...!");
    }

    public void jogarJogo() {
        System.out.println("JOGANDO UM JOGO!");
    }

    // Construtores
    public Pessoa() {}
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    // Métodos especiais Getters, Setters and toString
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
