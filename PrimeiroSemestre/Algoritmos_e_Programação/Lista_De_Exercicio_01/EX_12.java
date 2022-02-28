import java.util.Scanner;

public class EX_12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double L, R, areaQuadrado, areaCirculo;

		System.out.print("Informe o lado do quadrado: ");
		L = entrada.nextDouble();
		areaQuadrado = (L * L);

		System.out.print("Informe o raio do círculo: ");
		R = entrada.nextDouble();
		areaCirculo = (Math.PI * (R * R));

		if (areaQuadrado > areaCirculo) {
			System.out.println("A maior área é do: quadrado");
		} else {
			System.out.println("A maior área é do: círculo");
		}

		entrada.close();

	}

}
