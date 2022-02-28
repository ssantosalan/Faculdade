import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String operacaoStr;
		int tentativa = 0;

		System.out.println("Converta o número Hexadecimal 1F5 para a base Decimal. Escolha a alternativa correta: ");

		System.out.println("a) 501");
		System.out.println("b) 315");
		System.out.println("c) 116");
		System.out.println("d) 335");
		System.out.println("e) 35");
		System.out.println();

		do {
			System.out.print("Digite a alternativa: ");
			operacaoStr = entrada.next();
			switch (operacaoStr.toLowerCase()) {
			case "a":
				System.out.println("Resposta correta!");
				tentativa = tentativa + 1;
				System.out.println("Resposta correta na tentativa número " + tentativa);
				tentativa = 3;
				break;
			case "b", "c", "d", "e":
				System.out.println("Resposta incorreta!");
				System.out.println();
				tentativa = tentativa + 1;
				if (tentativa == 3) {
					System.out.println("Resposta incorreta nas " + tentativa + " tentativas");
				}
				break;
			default:
				System.out.println("Operação inválida!");
			}

		} while (tentativa < 3);

		entrada.close();

	}

}
