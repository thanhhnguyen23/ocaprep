package ocaprep.ch03;

import java.util.Arrays;

public class ReviewQuestion22 {
    public static void main(String[] args) {
        // what is the result of the following

        int[] random = {6, -4, 12, 0, -10};
        int x = 12;
        int y = Arrays.binarySearch(random, x); // which index is x? --> 2
        System.out.println(y); // output: 2

    }
}
