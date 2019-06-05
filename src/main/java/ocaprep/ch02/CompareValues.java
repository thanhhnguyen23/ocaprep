package ocaprep.ch02;

/*
 * Review Question 3
 */
public class CompareValues{
	/*
	 * what is the output of the following application
	 */
    public static void main(String[]args){
        int x = 0;
//        int x = 11;

        while(x++ < 10){
        	System.out.println("inside while loop, what is x: " + x);
        }
        System.out.println("outside while loop, what is x: " + x);
        // original problem
//
//        String message = x > 10 ? "Greater than" : false; // false: cannot convert boolean to String
//
        
        // experimenting so code compiles
        //-------------------------------------------------------------------------------- 
        // experiment 1
        String message = x > 10 ? "Greater than" : "Less than"; 

        // experiment 2
//        String message = x > 10 ? true: false; // boolean/String mismatch; must return String but boolean is provided

        // experiment 3
//        Boolean message = x > 10 ? true: false; // changed return type to Boolean/boolean
        //-------------------------------------------------------------------------------- 

        System.out.println(message + ", " + x); 
    }
}
