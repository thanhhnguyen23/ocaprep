package ocaprep.ch02.typecasting;

public class WideningExample {
	/*
	 * Widening Casting (automatically) - converting a smaller type to a larger type
	 * size
	 * 
	 * byte -> short -> char -> int -> long -> float -> double
	 * 
	 */

	public static void main(String[] args) {

		int myInt = 9;
		double myDouble = myInt; 		// will automatically cast int into double

		System.out.println(myInt); 		// output: 9
		System.out.println(myDouble); 	// output: 9.0
	}
}
