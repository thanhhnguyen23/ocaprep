package ocaprep.ch02.loops;

public class DoWhileLoopExample {

	public static void main(String[] args) {
//		int x = 10;
		int x = 1;
		
		do {
//			x = 1; // this line causes infinite loops do-while loop
			
			System.out.println("value of x: " + x);
			x++;
		}
		while(x < 10);
	}
}
