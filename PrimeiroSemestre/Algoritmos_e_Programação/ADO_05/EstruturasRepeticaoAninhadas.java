import java.util.Scanner;

public class EstruturasRepeticaoAninhadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, minuto, segundo;
		int i = 0;

		
		System.out.println("Escolha o dia da semana. Ex: 1 - Segunda, 2 - Terça... 7 - domingo.");
		System.out.print("Dia da semana: ");
		int opcao = sc.nextInt();
	
		
		
		do {
			System.out.println("Hora(s): ");
			hora = sc.nextInt();
		} while (hora < 0 || hora > 23);
		
		do {
			System.out.println("Minuto(s)");
			minuto = sc.nextInt();
		} while (minuto < 0 || minuto > 59);
		
		do {
		System.out.println("Segundo(s)");
		segundo = sc.nextInt();
		} while (segundo < 0 || segundo > 59);

		do {
		i++;	
			for (int h = 0; h <= 23; h++) {
				for (int m = 0; m <= 59; m++) {
					for (int s = 0; s <= 59; s++) {
						System.out.printf("%d:%d:%d\n", h, m, s);
		
						if (h == hora && m == minuto && s == segundo && i == opcao) {
							break;
						}
					}
					if (h == hora && m == minuto && i == opcao) {
						break;
					}
				}
				if (h == hora && i == opcao) {
					System.err.println("ALARME!!!");
					break;
				}
			}
			
		}while (i != opcao);

		switch (opcao) {
		
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2: 
			System.out.println("Terça-feira");
			break;
		case 3: 
			System.out.println("Quarta-feira");
			break;
		case 4: 
			System.out.println("Quinta-feira");
			break;
		case 5: 
			System.out.println("Sexta-feira");
			break;
		case 6: 
			System.out.println("Sábado");
			break;
		case 7: 
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Valor inválido!");
		}
		

		sc.close();
	}
}
