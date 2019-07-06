package ocaprep.ch03;

public class ReviewQuestion10 {

	public static void main(String[] args) {
		// what is the result of the following code

        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") System.out.println("=="); // "==" checks for equality
        if (a.equals("2cfalse")) System.out.println("equals"); // equals() checks for the value

	}
}
