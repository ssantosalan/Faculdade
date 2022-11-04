package pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ListarPessoas {
	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<>();

		lista.add(new Pessoa("Alan", 21));
		lista.add(new Pessoa("João", 30));
		lista.add(new Pessoa("Cauê", 25));
		lista.add(new Pessoa("Rô", 22));

		
		Comparator comparator = new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Pessoa p1 = (Pessoa) o1;
				Pessoa p2 = (Pessoa) o2;
				int aux;

				if (p1.getIdade() > p2.getIdade()) {
					return 1;
				}
				if (p1.getIdade() < p2.getIdade()) {
					return -1;
				}
				if (p1.getIdade() == p2.getIdade()) {
					return 0;
				}

				return 0;
			}
		};

		lista.sort(comparator);

		Consumer consumer = new Consumer() {

			@Override
			public void accept(Object t) {
				Pessoa p = (Pessoa) t;
				System.out.println(p);
			}

		};

		lista.forEach(consumer);

//		lista.forEach(nome -> System.out.println(nome));

	}
}
