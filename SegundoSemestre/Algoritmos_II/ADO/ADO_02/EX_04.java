/*
Grupo: 
	Alan Silva dos Santos
	Guilherme Alves Martins
	Jorge Luiz dos Santos Oliveira

Dada uma string, criar uma função recursiva (sem laços) que compute o número de caracteres ’x’ na string.
Exemplos:
contarX("xxhixx")  4
contarX("xhixhix")  3
contarX("hi")  0
Dica: utilize os métodos length() e substring() da classe String.
 */
public class EX_04 {

	 public static void main(String[] args) {
	        int contarCaractere = contarX("xxxxxxxxxx", 'x');

	        System.out.println(contarCaractere);

	    }

	    public static int contarX(String palavra, char x) {
	        if (palavra.equals("")) {
	            return 0;
	            
	            } else if (palavra.charAt(0) == x) {
	                  return contarX(palavra.substring(1), x) + 1;
	                  
	                 } else {
	                          return contarX(palavra.substring(1), x);
	        }

	    }
	}