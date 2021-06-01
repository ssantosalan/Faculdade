import java.util.Scanner;

public class EX_21 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Informe a quantidade de aluno da sala: ");
		int alunos = entrada.nextInt();
		
		String nomesAlunos[] = new String[alunos];
		double notasAlunos[] = new double[alunos];
		
		for(int i = 0; i < nomesAlunos.length; i++) {
			
			System.out.print("Nome do aluno: ");
			nomesAlunos[i] = entrada.next();
			System.out.print("Nota do aluno: ");
			notasAlunos[i] = entrada.nextDouble();
		}
		double soma = 0;
		double media = 0;
		for(double item : notasAlunos) {
			
			soma = soma + item;
		}
		System.out.println();
		media = soma / alunos;
		System.out.println("Soma das notas da sala: " + soma);
		System.out.println("Media: " + media);
		System.out.println();
		System.out.println("Acima da média: ");
		for (int i = 0; i < notasAlunos.length; i++) {
			
			if (notasAlunos[i] > media) {
				System.out.println("Nome do aluno: " + nomesAlunos[i]);
				System.out.println("Nota do aluno: " + notasAlunos[i]);
				System.out.println();
			}
		}
	}

}
