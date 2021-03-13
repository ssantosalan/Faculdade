import java.util.Scanner;

public class EX_9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salario, horasTrabalhada, valorHora;
		int numeroCadastro;

		System.out.print("Informe o número de cadastro: ");
		numeroCadastro = teclado.nextInt();

		System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
		horasTrabalhada = teclado.nextFloat();

		System.out.print("Informe o valor de cada hora: ");
		valorHora = teclado.nextFloat();
		salario = horasTrabalhada * valorHora;

		System.out.println();
		System.out.println("Número de cadastro: " + numeroCadastro);
		System.out.println("O salário é: " + salario);

		teclado.close();

	}

}
