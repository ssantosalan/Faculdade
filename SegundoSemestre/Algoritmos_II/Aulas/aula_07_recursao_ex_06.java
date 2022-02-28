
public class aula_07_recursao_ex_06 {

	public static void main(String[] args) {

	
		
	}

	public static int mdc(int m, int n) {
		int r;
		do {
			r = m % n;
			m = n;
			n = r;
		} while (r != 0);
		return m;
	}

	
	
}
