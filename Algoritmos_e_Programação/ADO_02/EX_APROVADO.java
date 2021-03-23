import java.util.Scanner;

public class EX_APROVADO {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float n1, n2, n3, media;
		byte numeroFaltas;
		String nomeAluno;

		System.out.println("*--* Calcula Média *--*");
		System.out.print("Nome: ");
		nomeAluno = entrada.next();
		System.out.print("N1: ");
		n1 = entrada.nextFloat();
		System.out.print("N2: ");
		n2 = entrada.nextFloat();
		System.out.print("N3: ");
		n3 = entrada.nextFloat();
		media = (n1 + n2 + n3) / 3;
		System.out.print("Número de faltas: ");
		numeroFaltas = entrada.nextByte();

		if ((media >= 6) && (numeroFaltas <= 18)) {
			System.out.println(nomeAluno + " está APROVADO com média: " + media);
		} else if ((numeroFaltas > 18) && (media >= 6)) {
			System.out.println(nomeAluno + " está REPROVADO por " + numeroFaltas + " faltas");
		} else if ((numeroFaltas > 18) && (media < 6)) {
			System.out.println(nomeAluno + " está REPROVADO com média: " + media + " e POR FALTA: " + numeroFaltas);
		} else {
			System.out.println(nomeAluno + " está REPROVADO com média: " + media);
		}
	}
}
