/*
Grupo: 
	Alan Silva dos Santos
	Guilherme Alves Martins
	Jorge Luiz dos Santos Oliveira

Temos v�rios coelhos e cada coelho tem duas orelhas grandes e flex�veis. Queremos calcular o n�mero total
de orelhas em todos os coelhos de forma recursiva (sem loops ou multiplica��o). Criar uma fun��o recursiva que
receba um n�mero N representando o n�mero de coelhos e retorne a n�mero total de orelhas.
 */
public class EX_03 {

	public static void main(String[] args) {
		System.out.println(recursividadeCoelho(3));

	}

	public static int recursividadeCoelho(int n) {

		if (n == 0) return 0;

		return recursividadeCoelho(n - 1) + 2;

	}

}
