
public class EX_06 {

	public static void main(String[] args) {
		int resultado = multRussa(20, 0);

		System.out.println(resultado);
	}

	public static int multRussa(int a, int b) {
		if (a == 0) {
			return 0;
		} else if ((a % 2) == 1) {
			a -= 1;
			return multRussa(a / 2, b * 2) + b;
		} else {
			return multRussa(a / 2, b * 2);
		}

	}

}
