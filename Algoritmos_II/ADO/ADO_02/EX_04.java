
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