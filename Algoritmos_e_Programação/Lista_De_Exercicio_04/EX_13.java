
public class EX_13 {

	public static void main(String[] args) {
		int vetorA[] = {1, 2, 3};
		int vetorB[] = {4, 5, 6};
		int vetorC[] = new int[vetorA.length + vetorB.length];
		int contador = 0;
		for (int i = 0; i < vetorC.length; i++) {
			
			if (i < vetorA.length) {
				vetorC[i] = vetorA[i]; 
			} else {
				vetorC[i] = vetorB[contador];
				contador++;
			}
			
			
			
		}
		System.out.println("Vetor C:");
		for (int item : vetorC)	{
			System.out.println(item);
		}
  
	}

}
