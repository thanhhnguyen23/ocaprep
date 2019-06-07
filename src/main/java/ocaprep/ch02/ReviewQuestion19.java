package ocaprep.ch02;

public class ReviewQuestion19 {
	/*
	 * what is the result of the following code snippet?
	 */

	public static void main(String[] args) {

		int m = 9, n = 1, x = 0;
		while (m > n) {
			m--;
			n += 2;
			x += m + n;
		}
		System.out.println(x); // output: 36

	}
	/*
	 * summary
	 * ------------------
	 * m -> 9, 8, 7, 6
	 * n -> 1, 3, 5, 7
	 * x -> 0, 11, 23, 36
	 */

}
