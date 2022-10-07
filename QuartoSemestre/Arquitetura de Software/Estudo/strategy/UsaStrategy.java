package strategy;

public class UsaStrategy {

	public static void main(String[] args) {
		var orcamento = new Orcamento(500);
		var ICMS = new ICMS();
		var ISS = new ISS();
		var calculadoraDeImpostos = new CalculadoraDeImpostos();
//		System.out.println(ICMS.calcular(orcamento));
		
		calculadoraDeImpostos.calculadora(orcamento, ICMS);
		calculadoraDeImpostos.calculadora(orcamento, ISS);
		
		
		
	}

}
