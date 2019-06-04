package ocaprep.ch01;

public class ReviewQuestion15 {
	/*
	 * which of the following lines of code will compile?
	 */
	public static void main(String[] args) {
		/*
		 * _ (underscores) are only valid within digits 1_234_678
		 * 		> leading _ or trailing _ are will not compile
		 */
		int i1 = 1_234; // will compile
//      double d1 = 1_234_.0; // will NOT compile // underscores must be within digits
//      double d2 = 1_234._0; // will NOT compile // underscores must be within digits
//      double d3 = 1_234.0_; // will NOT compile // underscores must be within digits
		double d4 = 1_234.0; // will compile
	}

}
