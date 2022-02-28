import java.util.Scanner;

public class EX_08 {

	static boolean numeroPrimo (int a) {
		
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número inteiro positivo: ");
		int a = entrada.nextInt();
		
		boolean numeroPrimo = numeroPrimo(a);
		
		System.out.println(numeroPrimo);
		
		
		
		
		entrada.close();

	}

}
