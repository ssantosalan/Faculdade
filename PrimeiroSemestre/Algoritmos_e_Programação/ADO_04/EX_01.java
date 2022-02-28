import java.util.Scanner;

public class EX_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		while (n < 100) { //inclusive o 100
			n++;
			if (n % 2 == 0) {
				System.out.println(n);
			}

		}

		sc.close();

	}

}
