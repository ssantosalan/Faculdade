import java.util.Scanner;

public class EX_07 {

	static double volume (double raio) {
	
		double volume = (4 * Math.PI * (raio*raio*raio))/3 ;
		
		return volume;
		
	}
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o raio (R): ");
		double raio = entrada.nextDouble();
		
		double volume = volume(raio);
		System.out.println("Volume é igual a " + volume);
		entrada.close();

	}

}
