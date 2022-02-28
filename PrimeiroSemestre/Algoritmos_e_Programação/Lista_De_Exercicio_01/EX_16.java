import java.util.Scanner;

public class EX_16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int horaInicial, horaFinal, duracaoJogo;

		System.out.print("Digite a hora inicial do jogo: ");
		horaInicial = entrada.nextInt();

		System.out.print("Digite a hora final do jogo: ");
		horaFinal = entrada.nextInt();

		if (horaInicial > horaFinal) {

			duracaoJogo = (horaFinal - horaInicial) + 24;
			System.out.println("O JOGO DUROU " + duracaoJogo + " HORAS (S)");

		} else if (horaInicial < horaFinal) {

			duracaoJogo = (horaFinal - horaInicial);
			System.out.println("O JOGO DUROU " + duracaoJogo + " HORAS (S)");

		} else {
			System.out.println("O JOGO DUROU 24 HORAS (S)");
		}

		entrada.close();

	}

}
