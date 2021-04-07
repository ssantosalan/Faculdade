import java.util.Scanner;

public class EX_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte opcao;

		System.out.println("Janeiro  -> 1");
		System.out.println("Feveiro  -> 2");
		System.out.println("Março    -> 3");
		System.out.println("Abril    -> 4");
		System.out.println("Maio     -> 5");
		System.out.println("Junho    -> 6");
		System.out.println("Julho    -> 7");
		System.out.println("Agosto   -> 8");
		System.out.println("Setembro -> 9");
		System.out.println("Outubro  -> 10");
		System.out.println("Novembro -> 11");
		System.out.println("Dezembro -> 12");
		System.out.println();
		System.out.print("Informe o mês: ");
		opcao = sc.nextByte();

		switch (opcao) {
		case 12, 1, 2, 6, 7:
			System.out.println("O mês é de Alta temporada");
			break;
		case 3, 4, 5, 8, 9, 10, 11:
			System.out.println("O mês é de Baixa temporada");
			break;
		default:
			System.out.println("Mês inválido!");
			break;

		}

		sc.close();

	}

}
