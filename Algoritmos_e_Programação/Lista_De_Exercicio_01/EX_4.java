import java.util.Scanner;

public class EX_4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2;

		System.out.print("Digite o primeiro número: ");
		N1 = entrada.nextInt();
		N1 = N1 + 1;

		System.out.print("Digite o segundo número: ");
		N2 = entrada.nextInt();
		N2 = N2 + 1;

		System.out.print("Os números consecutivos desses números são respectivamente: " + N1 + " e " + N2);

		entrada.close();

	}

}
