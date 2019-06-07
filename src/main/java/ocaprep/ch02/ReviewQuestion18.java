package ocaprep.ch02;

public class ReviewQuestion18 {
	/*
	 * what is the output of the following code snippet?
	 */
	public static void main(String[] args) {
		System.out.println("Review Question 18");

		int count = 0;
		ROW_LOOP: for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 2; col++) {
				if (row * col % 2 == 0) continue ROW_LOOP;
				count++;
			}
			System.out.println(count); // output: no output
		}
	}
}
