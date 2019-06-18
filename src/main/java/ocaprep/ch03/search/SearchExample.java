package ocaprep.ch03.search;

import java.util.Arrays;

public class SearchExample {
	public static void main(String[] args) {

		// example 1
		// array must be sorted to start with
//		int[] numbers = { 2, 4, 6, 8 };
//		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
//		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
//		System.out.println(Arrays.binarySearch(numbers, 1)); // -1
//		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
//		System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		
		// example 2
		int[] numbers = new int[] { 3, 2, 1 };
		System.out.println(Arrays.binarySearch(numbers, 2)); // 1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -4
	}
}
