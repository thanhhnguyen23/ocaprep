package ocaprep.ch01;

public class ReviewQuestion10 {
	/*
	 * valid main entry point methods
	 */

//	will compile
//	public void main(String[] args) {
//		System.out.println("public void main(String[]args)");
//	}

//  will compile
//	public static void main(String[] args) {
//		System.out.println("private static void main(String[]args)");
//	}
	
	/*
	 * does not contain a main type; will not compile
	 */
//	private static void main(String[] args) {
//		System.out.println("private static void main(String[]args)");
//	}

	/*
	 * return type is missing
	 */
//	public static final main(String[] args) {
//		System.out.println("public static final main(String[]args)");
//	}


	/*
	 * does not contain a main type; will not compile
	 */
//	public static void test(String[]args) {
//		System.out.println("public static void test");
//	}
	

	/*return type is missing
	 * 
	 */
//	public static main(String[] args) {
//		System.out.println("private static main(String[]args)");
//	}
}
