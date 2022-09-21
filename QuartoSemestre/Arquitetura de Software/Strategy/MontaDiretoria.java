package usa;
import composite.*; 

public class MontaDiretoria {
	
	public static void main(String[] args) {
		
	
	
	Departamento dp1 = new Departamento(10,20.);
	Departamento dp2 = new Departamento(20,30.);
	
	
	
	Diretoria dir1 = new Diretoria();
	
	dir1.adicionar(dp1);
	dir1.adicionar(dp2);
	
	System.out.println(dir1.getCusto());
	}
	

}
