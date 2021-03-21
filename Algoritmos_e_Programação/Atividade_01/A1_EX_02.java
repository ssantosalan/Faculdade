import java.util.Scanner;

public class A1_EX_02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float estoqueMedio, quantidadeMinima, quantidadeMaxima;

		System.out.print("Escreva a quantidade mínima do estoque: ");
		quantidadeMinima = teclado.nextFloat();

		System.out.print("Escreva q quantidade máxima do estoque: ");
		quantidadeMaxima = teclado.nextFloat();

		estoqueMedio = (quantidadeMaxima + quantidadeMinima) / 2;
		System.out.println("O estoque médio é: " + estoqueMedio);

		
		teclado.close();
	}
}
