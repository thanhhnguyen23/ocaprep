package ocaprep.ch03;

public class ReviewQuestion05 {
	public static void main(String[] args) {
		// what is the result of the following code
		// output: 2
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
//		if(s1 == s2) System.out.println("1"); // Incompatible operand types String and StringBuilder
		if(s1.equals(s2)) System.out.println("1");
	}
}
