package ocaprep.ch01;

public class ReviewQuestion13 {

	/*
	 * which of the following is true?
	 */

	/* 
	 * instance variables of type boolean defaults to false 	// true 
	 * instance variables of type boolean defaults to true 		// false 
	 * instance variables of type boolean defaults to null 		// false
	 */
	boolean myBoolean;
	
	/*
	 * instance variable of type int defaults to 0 		// true 
	 * instance variable of type int defaults to 0.0	// false 
	 * instance variable of type int defaults to null 	// false
	 */
	int myInt;

	public static void main(String[] args) {
		ReviewQuestion13 r = new ReviewQuestion13();

		// --------------------------------------------------------------------------------
		// testing
		// --------------------------------------------------------------------------------

		System.out.println(r.myInt);
	}
}
