package ocaprep.ch03;

public class ReviewQuestion02 {
	public static void main(String[] args) {
		
		// which of the following output
		// output: one, three, and four
		// four -> "Hello" = "Hello", but "Hello" string doesn't == to String t
		String s = "Hello";
		String t = new String(s);
		
		if("Hello".equals(s)) System.out.println("one");
		if(t == s) System.out.println("two");
		if(t.equals(s)) System.out.println("three");
		if("Hello" == s) System.out.println("four");
		if("Hello" == t) System.out.println("five");
		
		
	}

}
