import java.util.Scanner;

public class A1_EX_01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salario, horasTrabalhada, valorHora;

		System.out.print("Informe a quantidade de horas trabalhada no mês: ");
		horasTrabalhada = teclado.nextFloat();
		System.out.print("Informe o valor de cada horas: ");
		valorHora = teclado.nextFloat();
		salario = horasTrabalhada * valorHora;
		System.out.println("O salário é: " + salario);

		teclado.close();

	}

}
