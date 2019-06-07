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
            i--; // i -> 10, 9
            /*
             * without if conditional block will cause infinite loop
             */
            if (i == 8)
                keepGoing = false; // i -> 9; keepGoing -> false;
            result -= 2; // result: 15, result -> 15 - 2
        }
        /*
         * keepGoing is accessing the instance variable --> true; but will result in
         * false when keepGoing is assigned to false when i is assigned the value of 8
         */
        while (keepGoing);
        System.out.println(result); // output:
    }
}
