package ocaprep.ch02;

public class ReviewQuestion01 {

	/*
	 * which of the following Java operators can be used with boolean variables?
	 */

//	 == 		works
//	 + 			DOES NOT WORK
//	 -- 		DOES NOT WORK
//	 ! 			!= works
//	 % 			DOES NOT WORK
//	 <= 		works

	public static void main(String[] args) {
		/*
		 * examples of boolean expressions
		 * 		> boolean expressions must have comparison factor to be a valid boolean expression
		 */
      boolean b1 = true;
      boolean b2 = false;

      if(b1 == b2){
          System.out.println("== operator works");
      }
//      if(b1 + b2){ // invalid boolean expression
//          System.out.println("+ operator works");
//      }
//      if(b1 -- b2){ // invalid boolean expression
//          System.out.println("-- operator works");
//      }
      if(b1 != b2){
          System.out.println("!= operator works");
      }
//      if(b1 % b2){ // invalid boolean expression
//          System.out.println("% operator works");
//      }
//      if(b1 <= b2){ // invalid boolean expression
//          System.out.println("<= operator works");
//      }
      else{
          System.out.println("something went wrong");
      }

	}
}
