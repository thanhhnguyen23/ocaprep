package ocaprep.ch01;

/*
 * Review Question 4
 */
public class Snake {
	/*
	 * will it compile?
	 * 		> must be placed as instance variable
	 * 		> must be placed as local variable
	 * 		> must be declare variable before calling variable
	 */
//	String result = "done"; // will compile 
	public void shed(boolean time) {
//        String result = "done"; // will compile 
		if (time) {
//	String result = "done"; // out of scope; will not compile
		}
//		System.out.println(result);
//	String result = "done"; // declaration of variable must be placed before calling variable; will not compile
	}
}
