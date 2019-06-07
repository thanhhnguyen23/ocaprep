package ocaprep.ch02.typecasting;

public class NarrowingExample {
	/*
	 * Narrowing Casting (explicitly/manually) - converting a larger type to a smaller type
	 * size
	 * 
	 * double -> float -> long -> int -> char -> short -> byte
	 * 
	 */

	public static void main(String[] args) {

		double myDouble = 12.34; 		
		int myInt = (int) myDouble; 	// manual casting double to int

		System.out.println(myDouble); 	// output: 12.34
		System.out.println(myInt); 		// output: 12
	}
}
