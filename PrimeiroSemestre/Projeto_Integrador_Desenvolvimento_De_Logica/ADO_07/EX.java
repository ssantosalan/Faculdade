import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class EX {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String opcao;
		int contador = 0;
		String certo = "501";
		boolean acertou = false;

		do {

			List<String> urna = Arrays.asList("501", "315", "116", "335", "35");

			Collections.shuffle(urna);

			System.out
					.println("Converta o número Hexadecimal 1F5 para a base Decimal. Escolha a alternativa correta: ");
			System.out.print("a) " + urna.get(0));
			System.out.println();
			System.out.print("b) " + urna.get(1));
			System.out.println();

			System.out.print("c) " + urna.get(2));
			System.out.println();

			System.out.print("d) " + urna.get(3));
			System.out.println();

			System.out.print("e) " + urna.get(4));
			System.out.println();

			System.out.println();
			System.out.print("Digite a alternativa: ");
			opcao = entrada.next();

			switch (opcao.toLowerCase()) {
			case "a":
				contador++;
				if (urna.get(0).equals(certo)) {
					acertou = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.err.println("Resposta incorreta!");
				}
				break;
			case "b":
				contador++;
				if (urna.get(1).equals(certo)) {
					acertou = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.err.println("Resposta incorreta!");
				}
				break;
			case "c":
				contador++;
				if (urna.get(2).equals(certo)) {
					acertou = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.err.println("Resposta incorreta!");
				}
				break;
			case "d":
				contador++;
				if (urna.get(3).equals(certo)) {
					acertou = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.err.println("Resposta incorreta!");
				}
				break;
			case "e":
				contador++;

				if (urna.get(4).equals(certo)) {
					acertou = true;
				} else {
					System.out.println("Tentativa: " + contador);
					System.err.println("Resposta incorreta!");
				}
				break;

			default:
				contador++;
				System.out.println("Tentativa: " + contador);
				System.err.println("Operação inválida!");
			}

		} while (!acertou && contador < 3);

		if (acertou) {
			System.out.println("Resposta correta! Você acertou na " + contador + "ª tentativa!");
		} else {
			System.out.println("Resposta incorreta nas 3 tentativas!");
		}

		entrada.close();

	}

}
