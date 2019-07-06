package ocaprep.ch03;

public class ReviewQuestion12 {
	public static void main(String[] args) {
		// what is the result of the following code
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2,8); // output: 0189
		numbers.append("-").insert(2, "+"); // output: 018+9-
		System.out.println(numbers);
		
	}

}
