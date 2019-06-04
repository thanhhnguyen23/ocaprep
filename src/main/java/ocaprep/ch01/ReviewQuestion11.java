package ocaprep.ch01;

public class ReviewQuestion11 {
	/*
	 * which of the following are true?
	 */

	// an instance variable of type double defaults to null // false
//	Double myDouble; // wrapper class will result in null
//	double myDouble; // primitive data type results in 0.0

	// an instance variable of type int defaults to null // false
//	int myInt; // primitive data type results in 0
//	Integer myInt; // wrapper class will result in null

	// an instance variable of type String defaults to null // true
//	String myString; // String is an object; objects/wrapper classes initialize to null by default

	// an instance variable of type double defaults to null // false
//	double myDouble; // 0.0

	// an instance variable of type int defaults to 0.0 // false
//	int myInt; // 0

	// an instance variable of type String defaults to 0.0 // false
	String myString; // null

	public static void main(String[] args) {
		ReviewQuestion11 r = new ReviewQuestion11();

		//-------------------------------------------------------------------------------- 
		// testing
		//-------------------------------------------------------------------------------- 
		System.out.println(r.myString);
		
	}
}
