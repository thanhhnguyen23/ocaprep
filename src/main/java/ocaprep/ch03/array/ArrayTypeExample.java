package ocaprep.ch03.array;

public class ArrayTypeExample {
	/*
	 * creating an array with reference variables
	 */
	public static void main(String[] args) {
		String [] bugs = { "cricket", "bettle", "ladybug" };
		String [] alias = bugs;
		/*
		 * alias is referencing bugs
		 */
//		System.out.println(bugs.equals(alias)); // true
		
		/*
		 * variable bugs is an array -> L
		 * reference type -> java.lang.String
		 * hash code -> 7852e922
		 */
		System.out.println(bugs.toString()); // [Ljava.lang.String;@7852e922
		
	}

}
