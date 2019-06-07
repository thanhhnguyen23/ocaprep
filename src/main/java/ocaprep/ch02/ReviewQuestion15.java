package ocaprep.ch02;

public class ReviewQuestion15 {

	/*
	 * what is the output of the following code snippet?
	 */

	public static void main(String[] args) {

		int x = 1, y = 15;
		// original question
		// while x < 10 // condition must be within () parenthesis

		/*
		 * x < 10 --> 9 iterations
		 */
		while (x < 10) { // modified so code can compile
			/*
			 * y variable decrements
			 * x variable increments
			 * 
			 * x values -> 2,3,4,5,6,7,8,9,10; 9 iterations
			 * y values -> 14,13,12,11,10,9,8,7,6; 9 iterations
			 */
			y--; // y -> 15; y -> 14
			x++; // x -> 1; x -> 2
			System.out.println(x + ", " + y); // output: 10, 6
		}
	}
}
