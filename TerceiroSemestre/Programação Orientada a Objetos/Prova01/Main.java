package pacote;

public class Main {
    public static void main(String[] args) {
        // Pessoas
        Pessoa pessoa01 = new Pessoa();

        // Jogadores
        Gamer jogador01 = new Gamer();
        Gamer jogador02 = new Gamer("Julina", "Feminino", 20, "God of War");

        pessoa01.setNome("Alan");
        pessoa01.setIdade(26);
        pessoa01.setSexo("Masculino");

        jogador01.setJogoJogado("Counter Strike");
        jogador01.setNome("Maria");
        jogador01.setSexo("Feminino");
        jogador01.setIdade(22);

        System.out.println(pessoa01);

        System.out.println();
        System.out.println("Jogador 1");
        System.out.println(jogador01);
        System.out.println(jogador01.getJogoJogado());

        System.out.println();
        System.out.println("Jogador 2");
        System.out.println(jogador02);



    }
}
