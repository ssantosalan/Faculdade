import java.util.Random;

public class ADO_08 {

	public static void main(String[] args) {
		Random dado = new Random();
		int contador = 0;
		double um = 0;
		double dois = 0;
		double tres = 0;
		double quatro = 0;
		double cinco = 0;
		double seis = 0;
		double porcentagem;

		do {
			int valor = dado.nextInt(6);

			if (valor == 0) {
				um++;
			}
			if (valor == 1) {
				dois++;
			}
			if (valor == 2) {
				tres++;
			}
			if (valor == 3) {
				quatro++;
			}
			if (valor == 4) {
				cinco++;
			}
			if (valor == 5) {
				seis++;
			}
			contador++;
		} while (contador < 1000000);

		porcentagem = (um * 100) / 1000000;
		System.out.println("Jogadas primeiro lado: " + um);
		System.out.println("Porcentagem primeiro lado: " + porcentagem + "%");
		System.out.println();

		porcentagem = (dois * 100) / 1000000;
		System.out.println("Jogadas segundo lado: " + dois);
		System.out.println("Porcentagem segundo lado: " + porcentagem + "%");
		System.out.println();

		porcentagem = (tres * 100) / 1000000;
		System.out.println("Jogadas terceiro lado: " + tres);
		System.out.println("Porcentagem terceiro lado: " + porcentagem + "%");
		System.out.println();

		porcentagem = (quatro * 100) / 1000000;
		System.out.println("Jogadas quarto lado: " + quatro);
		System.out.println("Porcentagem quarto lado: " + porcentagem + "%");
		System.out.println();

		porcentagem = (cinco * 100) / 1000000;
		System.out.println("Jogadas quinto lado: " + cinco);
		System.out.println("Porcentagem quinto lado: " + porcentagem + "%");
		System.out.println();

		porcentagem = (seis * 100) / 1000000;
		System.out.println("Jogadas sexto lado: " + seis);
		System.out.println("Porcentagem sexto lado: " + porcentagem + "%");
	}

}
