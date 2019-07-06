package ocaprep.ch03;

public class ReviewQuestion14 {
	public static void main(String[] args) {
		// which of the following can replace line 4 to print "avaJ"
		// Both StringBuffer & StringBuilder have reverse() method
		StringBuilder puzzle = new StringBuilder("Java");
//		StringBuffer puzzle = new StringBuffer("Java");

		puzzle.reverse();
		System.out.println(puzzle);

	}

}
