import java.util.Scanner;

public class A1_EX_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N1, N2, produto;
		
		System.out.print("Digite o primeiro n�mero: ");
		N1 = entrada.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		N2 = entrada.nextInt();
		
		produto = (N1 * N2);
		
		System.out.println("O produto desses n�meros � igual a: " + produto);
		
		entrada.close();

	}

}
