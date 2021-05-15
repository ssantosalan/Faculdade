import java.util.Scanner;

public class EX_12 {
//falta fazer
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		double i = 1;
		double soma = 0;
		double contador = 0;
		int teste;
		while (i <= N) {
			
			soma = (i / ( N - contador));
			
			i++;
			contador--;
			
			
		}
		
		System.out.println(soma);
		
		
		entrada.close();

	}

}
