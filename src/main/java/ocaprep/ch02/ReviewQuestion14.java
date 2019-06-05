package ocaprep.ch02;

public class ReviewQuestion14 {
	/*
	 * what is the output of the following code snippet?
	 */
	public static void main(String[] args) {

		int c = 7;
		int result = 4;
		/*
		 * pre incrementing > first increment value and then assign value
		 */
		result += ++c; // results: 12
		// result -> 4 + (8)
		// result -> 12

		/*
		 * post incrementing > increment value of value after after assigning
		 */

		// --------------------------------------------------------------------------------
		// testing
		// --------------------------------------------------------------------------------
		// experiment 1
//		result += c++; // results: 11
//		// result + c++
//		// result -> 4 + 8
//		// result -> 12?
		System.out.println(result); // output: 12
	}
}
