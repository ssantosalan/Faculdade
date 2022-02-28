import java.util.Arrays;

public class intercala_MergeSort {

	public static void main(String[] args) {
		int[] v = { 3, 5, 5, 7, 9, 1, 2, 4, 6 };
		intercala(0, 5, 9, v);
		System.out.println(Arrays.toString(v));
	}

	public static void intercala(int p, int q, int n, int[] v) {
		int[] w = new int[n - p];
		int i = p;
		int j = q;
		int k = 0;
		while (i < q && j < n) {
			if (v[i] <= v[j]) {
				w[k] = v[i];
				i++;
			} else {
				w[k] = v[j];
				j++;
			}
			k++;
		}
		while (i < q) {
			w[k] = v[i];
			i++;
			k++;
		}
		while (j < n) {
			w[k] = v[j];
			j++;
			k++;
		}
		for (int x = p, y = 0; x < n; x++, y++) {
			v[x] = w[y];
		}
	}
}