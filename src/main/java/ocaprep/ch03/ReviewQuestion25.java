package ocaprep.ch03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReviewQuestion25 {
    public static void main(String[] args) {
        // what is the result of the following

        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);

//        for(String s : hex) System.out.println(s); // [30, 3A, 8, FF]

        int x = Collections.binarySearch(hex, "8"); // x -> 2
        int y = Collections.binarySearch(hex, "3A"); // y -> 1
//        int z = Collections.binarySearch(hex, "4F"); // z -> size of hex, -4
        int z = Collections.binarySearch(hex, "AA"); // z -> size of hex, -4

        System.out.println(x + " " + y + " " + z);

    }
}
