package ocaprep.ch02;

public class ReviewQuestion04 {
	/*
	 * what change would allow the following snippet to compile?
	 */
	public static void main(String[] args) {
		// byte -> short > int -> long -> float -> double
		long x = 10;
		/*
		 * cannot convert long to int; will not compile; narrowing must be done explicitly
		 */
		//original question
//		
//		int y = 2 * x; // must cast x to int; 2 * ((int) x)
//

		/*
		 * return type float will widen the data type, therefore data type of long
		 * will compile
		 */

		// experimenting so code compiles
		//-------------------------------------------------------------------------------- 
		// experiment 1
//		float y = 2 * ((int) x); // must cast x as int

		// experiment 2
//		int y = 2 * ((int) x); // must explicitly narrow primitive explicitly
		//-------------------------------------------------------------------------------- 
	}
}
