package exemplo3;

public interface TestarInterface {
	public static void main(String[] args) {
//
//		NomeCompleto nome = new NomeCompleto() {
//
//			@Override
//			public String getNome() {
//				return "Alan Silva dos Santos";
//			}
//		};

//		NomeCompleto nome = () -> {
//			return "Alan Silva dos Santos";
//		};

		NomeCompleto nome = () -> "Alan Silva dos Santos";

		nome.exibir(nome.getNome());

	}
}
