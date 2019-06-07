package ocaprep.ch02;

public class ReviewQuestion16 {
	/*
	 * what is the output of the following code snippet?
	 */
	public static void main(String[] args) {
		/*
		 * for a do-while loop to work appropriately
		 * 		> must declare instance variable aka outside of the do-while loop block
		 * 		> must increment
		 */
		
//		// original question
//		//---------------------------------
//		do {
//			int y= 1;
//			System.out.println(y++ + " ");
//		} while (y <= 10); // out of scope; code will not compile 
//		//---------------------------------

		// experiment 1
		//------------------------------------------------------- 
		int y = 1; 

		do {
//			y = 1; // line of code causes infinite do-while loop
			System.out.println(y++ + " "); 
			y++;
		}
		// 10 iterations with condition (1 <= 10)
		// y variable is out of scope
		while (y <= 10); 
		
		//------------------------------------------------------- 
	}
}
