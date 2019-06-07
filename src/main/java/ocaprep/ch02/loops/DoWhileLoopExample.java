package ocaprep.ch02.loops;

public class DoWhileLoopExample {
    public static void main(String[] args) {
        // instance variable
        int i = 5;

        do {
            /*
             * local variable and therefore a block scope
             */
            // int i = 5; // local variable
            System.out.println(i); // output: 5,6,7,8,9,10; 6 iterations
            i++;
        }
        /*
         * variable i of type int is out of scope
         */
        while (i <= 10);
    }
}