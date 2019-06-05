package ocaprep.ch02;

public class ReviewQuestion09 {
	/*
	 * how many times will the following code print "Hello World"?
	 */
	public static void main(String[] args) {

//		for (int i = 0; i < 10;) { // without i++ will cause infinite loop
		for (int i = 0; i < 10; i++) { // incrementer needs to be in the conditional statement
//			i = i++; // looks like it doesn't alter behavior
//			System.out.println("iteration: " + i);
			System.out.println("Hello World"); // output: 10 times Hello World starting at 0
		}

	}
}
