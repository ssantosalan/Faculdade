package ex03;

public class InsertionSort implements SortingStrategy {
	public int[] sort(int[] inputArray) {

		for (int i = 1; i < inputArray.length; i++) {
			int tmp = inputArray[i];
			int j;

			for (j = i; j > 0; j--) {
				if (inputArray[j - 1] < tmp)
					break;
				inputArray[j] = inputArray[j - 1];
			}

			inputArray[j] = tmp;
		}
		System.out.println("Insertion Sort");
		return inputArray;
	}
}
