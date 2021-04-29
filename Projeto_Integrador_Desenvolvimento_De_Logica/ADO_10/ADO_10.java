import java.util.Scanner;
import java.util.Random;

public class ADO_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random dado = new Random();
		int valor;
		int a = dado.nextInt(100) + 1;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um valor entre 1 e 100");
			valor = sc.nextInt();

			if (valor == a) {
				System.out.println("Parabéns, você ganhou o jogo!");
				break;
			} else if (valor - a == 1 || a - valor == 1) {
				System.out.println("TÁ QUENTE!");

			} else if (valor > a) {
				System.out.println("O valor digitado é MAIOR que o valor escolhido pelo computador.");
				System.out.println();
			} else if (valor < a) {
				System.out.println("O valor digitado é MENOR que o valor escolhido pelo computador.");
				System.out.println();
			} 
			 if (i == 4) {
				 System.out.println("Valor escolhido pelo computador: " + a);
				System.err.println("---Game Over!---");
			}

		}

		sc.close();

	}

}
