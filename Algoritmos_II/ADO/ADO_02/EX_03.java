/*
Grupo: 
	Alan Silva dos Santos
	Guilherme Alves Martins
	Jorge Luiz dos Santos Oliveira

Temos vários coelhos e cada coelho tem duas orelhas grandes e flexíveis. Queremos calcular o número total
de orelhas em todos os coelhos de forma recursiva (sem loops ou multiplicação). Criar uma função recursiva que
receba um número N representando o número de coelhos e retorne a número total de orelhas.
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
