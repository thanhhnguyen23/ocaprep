package ocaprep.ch03;

public class ReviewQuestion11 {

	public static void main(String[] args) {

        // what is the result of the following code
        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");

        total += letters.substring(1,2).length(); // b -> 1
        total += letters.substring(6,6).length(); // "" -> 1
//        total += letters.substring(6,5).length(); // String index out of range: -1

        System.out.println(total); // output: 1
	}
}
