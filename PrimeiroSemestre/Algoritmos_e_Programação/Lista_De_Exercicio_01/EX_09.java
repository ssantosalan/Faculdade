import java.util.Scanner;

public class EX_09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salario, horasTrabalhada, valorHora;
		int numeroCadastro;

		System.out.print("Informe o n�mero de cadastro: ");
		numeroCadastro = teclado.nextInt();

		System.out.print("Informe a quantidade de horas trabalhadas no m�s: ");
		horasTrabalhada = teclado.nextFloat();

		System.out.print("Informe o valor de cada hora: ");
		valorHora = teclado.nextFloat();
		salario = horasTrabalhada * valorHora;

		System.out.println();
		System.out.println("N�mero de cadastro: " + numeroCadastro);
		System.out.println("O sal�rio �: " + salario);

		teclado.close();

	}

}
