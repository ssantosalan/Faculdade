package segundo;

import java.util.Scanner;

public class EX_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		
		int n = entrada.nextInt();
		int n1 = n*1;
		int n2 = n*2;
		int n3 = n*3;
		System.out.println("Os 3 primeiros múltiplos de " +n+ " são: "+ n1 +", " + n2 +", "+ n3);

	}

}
