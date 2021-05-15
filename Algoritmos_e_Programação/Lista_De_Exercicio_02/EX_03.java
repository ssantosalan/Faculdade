import java.util.Scanner;

public class EX_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int maior = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Informe o " + i + "º número: ");
			 n = entrada.nextInt();
			 if (n > maior) {
				 maior = n;
			 }
		}
		System.out.println("Maior número: " + maior);
		
		
		entrada.close();

	}

}
