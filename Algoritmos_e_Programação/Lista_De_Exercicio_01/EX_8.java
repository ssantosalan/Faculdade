import java.util.Scanner;

public class EX_8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float N1, N2, N3, N4, MEDIA;

		System.out.print("Digite o primeiro número: ");
		N1 = entrada.nextFloat();

		System.out.print("Digite o segundo número: ");
		N2 = entrada.nextFloat();

		System.out.print("Digite o terceiro número: ");
		N3 = entrada.nextFloat();

		System.out.print("Digite o quarto número: ");
		N4 = entrada.nextFloat();

		MEDIA = (N1 + N2 + N3 + N4) / 4;

		System.out.println("A média é: " + MEDIA);

		entrada.close();

	}

}
