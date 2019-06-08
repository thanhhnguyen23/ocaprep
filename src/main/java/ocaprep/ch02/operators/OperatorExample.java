package ocaprep.ch02.operators;

public class OperatorExample {
	/*
	 * increment and decrement operators
	 * 
	 * 		> pre-increment operator updates the value for counter and outputs the new value
	 * 		> post-decrement operator also updates the value but outputs the value before the decrement occurs
	 * 
	 * operator precedence
	 	//TODO -- look up operator precedence
	 */
	
	public static void main(String[] args) {
		int counter = 0;
		System.out.println(counter); // output: 0
		System.out.println(++counter); // output: 1

		System.out.println(counter); // output: 1
		System.out.println(counter--); // output: 1

		System.out.println(counter); // output: 0
		
		
	}

}
