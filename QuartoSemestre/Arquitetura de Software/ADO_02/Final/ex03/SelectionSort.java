package ex03;

public class SelectionSort implements SortingStrategy {

	public int[] sort(int[] inputArray) {

		for (int i = 0; i < inputArray.length - 1; i++) {
			int min = i; 
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[j] < inputArray[min])
					min = j;
			}
			
			swap(inputArray, i, min);
		}
		System.out.println("Selection Sort");
		return inputArray;
	}

	private void swap(int[] inputArray, int k, int l) {
		int temp = inputArray[k];
		inputArray[k] = inputArray[l];
		inputArray[l] = temp;
	}
}
