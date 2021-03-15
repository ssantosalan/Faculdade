import java.util.Scanner;

public class EX_02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N1, N2;

		System.out.print("Digite o valor da base: ");
		N1 = teclado.nextInt();

		System.out.print("Digite o valor do expoente: ");
		N2 = teclado.nextInt();

		double resultado = Math.pow(N1, N2);
		System.out.println("Resultado: " + resultado);
		
		teclado.close();

	}

}
