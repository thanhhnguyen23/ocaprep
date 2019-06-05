package ocaprep.ch02;

public class ReviewQuestion07 {
	/*
	 * what is the output of the following code?
	 */
	public static void main(String[] args) {
		int x = 5;
//        5 > 2 --> true
//        next statement
//        5 < 4 --> false
//        resulting in 8
//        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7); // will compile; output: 8

//		another example
        System.out.println( x > 2 ? x < 4 ? "California" : "Oregon" : "Washington"); 
        // 5 > 2 --> true
        // 5 < 4 --> false
        // returns --> Oregon
	}
}
