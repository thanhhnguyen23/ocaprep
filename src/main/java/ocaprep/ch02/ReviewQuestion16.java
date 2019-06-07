package ocaprep.ch02;

public class ReviewQuestion16 {
	/*
	 * what is the output of the following code snippet?
	 */
	public static void main(String[] args) {
		/*
		 * for a do-while loop to work appropriately > must declare instance variable
		 * aka outside of the do-while loop block > must increment
		 */
		// instance variable
		// int y = 1;

		// original question
		// ---------------------------------
		// do {
		// 	/*
		// 	 * local variables are block scope; 
		// 	 * therefore conditional cannot access variable y of int type; 
		// 	 * must declare instance variable
		// 	 */
		// 	// int y = 1; // local variable
		// 	System.out.println(y++ + " ");
		// } while (y <= 10); // out of scope when local variable is used; code will not compile

		// ---------------------------------

		// experiment 1
		// -------------------------------------------------------
		// int y = 1; // instance variable

		// do {
		// 	// y = 1; // local variable is block scope; code will not compile
		// 	System.out.println(y++ + " ");
		// 	y++;
		// }
		// // 10 iterations with condition (1 <= 10)
		// // y variable is out of scope
		// while (y <= 10);

		// -------------------------------------------------------
	}
}
