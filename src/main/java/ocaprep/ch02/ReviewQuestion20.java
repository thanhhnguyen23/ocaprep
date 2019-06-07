package ocaprep.ch02;

public class ReviewQuestion20 {
	/*
	 * what is the result of the following code snippet?
	 */

	public static void main(String[] args) {

		final char a = 'A', d = 'D';
		char grade = 'B'; // 'B' and B are different and compiler is able to distinguish between the two

		switch (grade) {
		case a:
		case 'B':
			// no break statement so case falls into the next switch statement
			System.out.print("great"); // output: greatgood
		case 'C':
			System.out.print("good");
			/*
			 * will break out of the switch cases; otherwise compiler will go through each switch statement
			 */
			break;
		case d:
		case 'F': System.out.print("not good");
		}

	}
}
