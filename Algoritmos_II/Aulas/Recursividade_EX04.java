
public class Recursividade_EX04 {

	public static void main(String[] args) {
		
		binario(13);
	}
	
	public static void binario(int n) {
		if (n < 2) {
			System.out.println(n);
		}
		else {
			binario(n / 2);
			System.out.println(n % 2);
		}
	}

}
