import java.util.Scanner;

public class EX_11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número natural: ");
		int N = entrada.nextInt();
		
		double i = 1.0;
		double soma = 0;

		for (i = 1; i < N; i++) {
			
			soma = soma + i;
			
			soma = soma - (1 / i);
			i++;
			soma = soma + (1 / i);
			
		}

		System.out.println(soma);
		
		
		entrada.close();

	}

}
