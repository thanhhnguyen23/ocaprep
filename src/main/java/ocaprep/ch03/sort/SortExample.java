package ocaprep.ch03.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample {
	// simple example sorts three numbers
	public static void main(String[] args) {
		// example 1
//		int[] numbers = {6,9,1};
//		Arrays.sort(numbers);
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i] + " ");
//		}

		// example 2
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
		numbers.add(5);
		numbers.add(81);

		Collections.sort(numbers);
		System.out.println(numbers); // 5, 81, 99
	}
}
