import java.util.Arrays;

public class Aula_10 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 6, 7 };
		int[] b = { 2, 4, 5 };
		int[] c = intercalar(a, b);
		System.out.println("C = " + Arrays.toString(c));
	}

	public static int[] intercalar(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		int i = 0; // vetor a
		int j = 0; // vetor b
		int k = 0; // vetor c
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				c[k] = a[i];
				i++;
			} else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		while (i < a.length) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			c[k] = b[j];
			j++;
			k++;
		}
		return c;
	}
}