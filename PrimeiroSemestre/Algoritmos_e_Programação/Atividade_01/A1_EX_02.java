import java.util.Scanner;

public class A1_EX_02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float estoqueMedio, quantidadeMinima, quantidadeMaxima;

		System.out.print("Escreva a quantidade m�nima do estoque: ");
		quantidadeMinima = teclado.nextFloat();

		System.out.print("Escreva q quantidade m�xima do estoque: ");
		quantidadeMaxima = teclado.nextFloat();

		estoqueMedio = (quantidadeMaxima + quantidadeMinima) / 2;
		System.out.println("O estoque m�dio �: " + estoqueMedio);

		
		teclado.close();
	}
}
