package ex01;

import java.util.HashSet;
import java.util.Set;

public class CinemaSingleton {
	private static CinemaSingleton INSTANCE;
	private Set<String> assentosDisponiveis;

	public static CinemaSingleton getINSTANCE() {
		if (INSTANCE == null) {
			synchronized (CinemaSingleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new CinemaSingleton();
				}
			}
		}
		return INSTANCE;
	}

	private CinemaSingleton() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("2B");
	}

	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);

	}

}
