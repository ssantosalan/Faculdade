import java.util.Scanner;

public class EX_2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String operacaoStr;

		System.out.println("Converta o número Hexadecimal 1F5 para a base Decimal. Escolha a alternativa correta: ");

		System.out.println("a) 501");
		System.out.println("b) 315");
		System.out.println("c) 116");
		System.out.println("d) 335");
		System.out.println("e) 35");
		System.out.println();

		System.out.print("Digite a alternativa: ");

		operacaoStr = entrada.next();

		switch (operacaoStr.toLowerCase()) {
		case "a":
			System.out.println("Resposta correta");
			break;
		case "b", "c", "d", "e":
			System.out.println("Resposta incorreta");
			break;
		default:
			System.out.println("Operação inválida!");

		}

		entrada.close();
	}

}
