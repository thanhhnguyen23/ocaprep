package ocaprep.ch03;

public class ReviewQuestion07 {

	public static void main(String[] args) {

        String letters = "abcdef";
        System.out.println(letters.length()); // 6
        System.out.println(letters.charAt(3)); // d
        System.out.println(letters.charAt(6)); // StringIndexOutOfBoundsException: String index out of range: 6

	}
}
