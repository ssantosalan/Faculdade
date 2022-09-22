package exemplo;

public class UsaStrategy {

	public static void main(String[] args) {
		Distancia distancia = new Distancia(100);
		System.out.println(ListaEmpresas.CBA.operacao(distancia));
	}

	public static double calcularFrete(String nomeEmpresa, Distancia distancia) {
		Empresa emp;
		if (nomeEmpresa.equals("ABC")) {
			emp = new ABC();
			return emp.operacao(distancia);
		} else if (nomeEmpresa.equals("CBA")) {
			emp = new CBA();
			return emp.operacao(distancia);

		} else if (nomeEmpresa.equals("XPTO")) {
			emp = new XPTO();
			return emp.operacao(distancia);

		} else {
			return -1;
		}
	}

}
