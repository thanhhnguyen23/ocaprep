package ocaprep.ch03;

public class ReviewQuestion06 {
	public void roar(String roar1, StringBuilder roar2) {
		
		roar1.concat("!!!");
		roar2.append("!!!");
	}
	public static void main(String[] args) {
		// result of the following code
		// output: roar roar !!!
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new ReviewQuestion06().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2);
		
	}

}
