import java.util.Scanner;

public class EX_08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float N1, N2, N3, N4, MEDIA;

		System.out.print("Digite o primeiro n�mero: ");
		N1 = entrada.nextFloat();

		System.out.print("Digite o segundo n�mero: ");
		N2 = entrada.nextFloat();

		System.out.print("Digite o terceiro n�mero: ");
		N3 = entrada.nextFloat();

		System.out.print("Digite o quarto n�mero: ");
		N4 = entrada.nextFloat();

		MEDIA = (N1 + N2 + N3 + N4) / 4;

		System.out.println("A m�dia �: " + MEDIA);

		entrada.close();

	}

}
