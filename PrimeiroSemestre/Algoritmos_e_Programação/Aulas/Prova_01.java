import java.util.Scanner;

public class Prova_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1, s =1, n =10;
		while (i<=n) {
			s = s * i;
			
			System.out.println("interações" +i + "S = " + s);
			i++;
			
			
		}
		
		
		
		
		sc.close();
		
	}

}
