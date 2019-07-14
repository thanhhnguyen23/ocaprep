package ocaprep.ch03;

import java.util.ArrayList;
import java.util.List;

public class ReviewQuestion26 {
    public static void main(String[] args) {
        // which of the following are true statements about the following code?

        List<Integer> ages = new ArrayList<>(); // true
        ages.add(Integer.parseInt("5")); // true
        ages.add(Integer.valueOf("6")); // true
        ages.add(7); // true
        ages.add(null); // true

        for(int age: ages) System.out.println(age); // true // output: [5,6,7]

    }
}
