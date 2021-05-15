import java.util.Scanner;

public class EX_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N = entrada.nextInt();
		int i = 0;
		int soma = 0;
		int oi;
		while (N > i) {
			soma = i + i;
			i++;
		}
		System.out.println(soma);
		
		
		entrada.close();

	}

}
