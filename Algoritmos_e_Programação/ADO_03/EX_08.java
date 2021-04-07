import java.util.Scanner;

public class EX_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valorMulta, anuidade;

		System.out.print("Informe a anuidade: ");
		anuidade = sc.nextInt();

		System.out.printf("Valor a ser pago em Janeiro: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Feveiro: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Março: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Abril: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Maio: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Junho: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Julho: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Agosto: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Setembro: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Outubro: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Novembro: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;
		System.out.printf("Valor a ser pago em Dezembro: R$%.2f \n", anuidade);
		valorMulta = anuidade * 0.05;
		anuidade = anuidade + valorMulta;

		sc.close();

	}

}
