
public class aula02 {

	public static void main(String[] args) {
		int[] x = {7, 2, 3};
		int[] y = {4, 2, 5};
		String r = diferenca(y, x);
		System.out.println(r);

	}
	
	public static String diferenca (int[] a, int[] b) {
		String res = "";
		boolean achou;
		for (int i = 0; i <a.length; i++) {
			achou = false;
			for (int j = 0; j <b.length; j++) {
				if (a[i] ==b[j] ) {
					achou = true;
					break;
				}
			}
			if (!achou) {
				res += a[i] + " ";
			}
		}
		return res;
	}

}
