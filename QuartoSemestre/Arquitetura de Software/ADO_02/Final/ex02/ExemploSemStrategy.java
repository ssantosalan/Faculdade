package ex02;

public class ExemploSemStrategy {

	public static void main(String[] args) {
        Imposto imposto = new Imposto(100);
        System.out.println(obterFrete(imposto, Orcamento.values()[0]));

    }

    public static double obterFrete(Imposto imposto, Orcamento empresa) {
        
       return empresa.calcularImposto(imposto, empresa);
        
    }

}
