import java.util.Arrays;

public class EX_01 {

	public static void main(String[] args) {
		int vetor[] = {3,5,9,11,15,17,19,6};
		ordenarUltimo(vetor);
		System.out.println(Arrays.toString(vetor));
	}
	
	public static void ordenarUltimo (int v []) {
		int k = v.length - 1;
		int x = v[k];
		while (k > 0 && x < v[k-1]) {
			v[k] = v[k-1];
			k--;
		}
		v[k] = x;
	}

}
