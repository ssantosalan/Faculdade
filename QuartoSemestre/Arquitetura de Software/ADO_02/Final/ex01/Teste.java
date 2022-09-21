package ex01;

public class Teste {

	public static void main(String[] args) {
		agendarAssento("1A");
		agendarAssento("1A");
		agendarAssento("2B");
		agendarAssento("2B");
		agendarAssento("2B");

	}

	private static void agendarAssento(String assento) {
		CinemaSingleton a = CinemaSingleton.getINSTANCE();

		if (a.bookAssento(assento) == true) {
			System.out.println("Seu assento foi reservado com sucesso!");
		} else {
			System.out.println("Assento inválido, pois já foi reservado! Favor informar outro assento!");
		}

	}

}
