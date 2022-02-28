import java.util.Scanner;

public class EX_09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe a quantidade de aluno: ");
		int alunos = entrada.nextInt();
		int notas = 0;
		int soma = 0;
		for (int i = 1; i <= alunos; i++) {
			System.out.print("Informe a nota do " + i + "º aluno: ");
			notas = entrada.nextInt();
			soma = soma + notas;
		}
		int media = soma / alunos;
		System.out.println("Média: " + media);

		entrada.close();

	}

}
