import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2;

		System.out.print("Digite o primeiro n�mero: ");
		N1 = entrada.nextInt();
		N1 = N1 + 1;

		System.out.print("Digite o segundo n�mero: ");
		N2 = entrada.nextInt();
		N2 = N2 + 1;

		System.out.print("Os n�meros consecutivos desses n�meros s�o respectivamente: " + N1 + " e " + N2);

		entrada.close();

	}

}
