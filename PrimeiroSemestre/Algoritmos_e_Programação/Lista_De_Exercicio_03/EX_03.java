import java.util.Scanner;

public class EX_03 {

	static int fatorial(int n) {
		int fatorial = 1;
		
		do {
			fatorial = fatorial * n;
			n--;
		} while (n > 0);
		
		return fatorial; 
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe N: ");
		int n = entrada.nextInt();
		int fatorial = fatorial(n);
		System.out.println("Fatorial: " + fatorial);
		
		
		entrada.close();

	}

}
