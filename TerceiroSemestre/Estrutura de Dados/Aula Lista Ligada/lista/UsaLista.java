
package lista;

public class UsaLista {

	public static void main(String[] args) {
		Lista lista = new Lista();

		Carro c1 = new Carro("VW", "FOX", 2014, 1);
		Carro c2 = new Carro("BMW", "XXX", 2022, 2);
		Carro c3 = new Carro("yyy", "yyy", 2023, 3);
		Carro c4 = new Carro("yyy4", "yyy4", 2024, 4);

		lista.inserir(c1);
		lista.inserir(c2);
		lista.inserir(c3);
		lista.inserir(c4);

//		lista.exibir();
//		System.out.println(lista.pesquisarId(3));

//		Carro c = lista.pesquisarId(3);
//		if (c != null) {
//			System.out.println(c);
//		} else {
//			System.out.println("Id não encontrado");
//		}

		System.out.println("Sem remover");
		lista.exibir();

//		System.out.println("Ao remover");
//		lista.remover(1);
//		lista.exibir();
		
		System.out.println("Ao remover último");
		lista.remover(3);
		lista.exibir();

	}

}
