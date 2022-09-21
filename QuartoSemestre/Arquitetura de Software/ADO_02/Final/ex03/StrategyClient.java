package ex03;

import java.util.Scanner;

public class StrategyClient {
	public static void main(String[] args) {

		System.out.println("Escolhe entre : 'BubbleSort' or 'SelectionSort' or 'InsertionSort'");
		Scanner scanner = new Scanner(System.in);
		String sortAlgorithm = scanner.next();
		System.out.println("Escolhido: : " + sortAlgorithm);

		SortContext context = new SortContext();

		if ("BubbleSort".equalsIgnoreCase(sortAlgorithm)) {
			context.setSortingStrategy(new BubbleSort());
		} else if ("SelectionSort".equalsIgnoreCase(sortAlgorithm)) {
			context.setSortingStrategy(new SelectionSort());
		} else if ("InsertionSort".equalsIgnoreCase(sortAlgorithm)) {
			context.setSortingStrategy(new InsertionSort());
		}

		context.sort();

		scanner.close();

	}
}