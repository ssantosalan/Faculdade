import java.util.Scanner;

public class EX_3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float N1, N2, MEDIA;

		System.out.print("Digite a primeira nota: ");
		N1 = entrada.nextFloat();

		System.out.print("Digite a segunda nota: ");
		N2 = entrada.nextFloat();

		MEDIA = ( ((N1 * 6) + (N2 * 4)) / 10);

		System.out.printf("A média é: %.2f \n", MEDIA);

		entrada.close();

	}

}
