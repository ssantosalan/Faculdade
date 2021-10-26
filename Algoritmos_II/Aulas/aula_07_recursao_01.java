
public class aula_07_recursao_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int profundidadeFib(int n) {
		if (n < 2) {
			return 0;
		}
		return profundidadeFib(n - 1) + profundidadeFib(n - 2 + 2);

	}
}
