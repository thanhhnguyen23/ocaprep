package ocaprep.ch03.sort;

import java.util.Arrays;

public class SortExample {
	// simple example sorts three numbers
	public static void main(String[] args) {
		int[] numbers = {6,9,1};
		Arrays.sort(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
	}
}
