import java.util.Scanner;

public class EX_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		int valorT = 100;

		System.out.print("Informe a idade do conveniado: ");
		idade = sc.nextInt();

		if (idade < 10) {
			valorT = valorT + 80;
		} else if (idade >= 10 && idade <= 30) {
			valorT = valorT + 50;
		} else if (idade >= 40 && idade <= 60) {
			valorT = valorT + 95;
		} else {
			valorT = valorT + 130;
		}

		System.out.print("O valor total a ser pago pelo plano de saúde será de: R$" + valorT);

		sc.close();
	}

}
