package ocaprep.ch02;

public class ReviewQuestion06 {
	/*
	 * what is the output of the following code snippet?
	 */
	public static void main(String[]args){
		// integral types
		// byte -> short -> int -> long -> float -> double 
        int x = 4;
        long y = x * 4 - x++; // will compile; int converts to long implicitly

        if(y < 10) System.out.println("Too Low");
        
        else System.out.println("Just right");
//        else System.out.println("Too High"); // will not compile; syntax error
    }
}
