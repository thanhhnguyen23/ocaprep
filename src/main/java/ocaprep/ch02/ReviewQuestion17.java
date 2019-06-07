package ocaprep.ch02;

public class ReviewQuestion17 {
    /*
     * what is the output of the following code snippet?
     */

    public static void main(String[] args) {

        // instance variables;
        boolean keepGoing = true;
        int result = 15, i = 10;

        do {
            // local variable
            i--; 
            /*
             * if statement will always hit and "fall throw" whether or not condition is true/false
             * without if conditional block will cause infinite loop
             * 		> do-while loop continues until equality is broken
             */
            if (i == 8)
                keepGoing = false; 
            result -= 2; 
        }
        /*
         * when keepGoing -> false
         * 		> breaks equality and output will be triggered
         */
        while (keepGoing);
        System.out.println(result); // output: 11
    }
    
    /*
     * Summary: 
     * -------------------
     * i -> 10, 9
     * result -> 15, 13
     * keepGoing -> true
     * 
     * i -> 9, 8
     * result -> 13, 11
     * keepGoing -> false
     * 
     * output: 11
     */
}
