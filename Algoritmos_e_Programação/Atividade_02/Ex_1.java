import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int N1, N2, troca;

		System.out.print("Digite o primeiro valor: ");

		N1 = entrada.nextInt();

		System.out.print("Digite o segundo valor: ");

		N2 = entrada.nextInt();

		troca = N1;
		N1 = N2;
		N2 = troca;

		System.out.println("Os valores foram trocas. O primeiro valor agora é: " + N1);
		System.out.println("E o segundo valor agora é: " + N2);

		entrada.close();
	}

}
