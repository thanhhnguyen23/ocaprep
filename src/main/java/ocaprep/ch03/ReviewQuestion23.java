package ocaprep.ch03;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReviewQuestion23 {
    public static void main(String[] args) {
        // what is the result of the following

        List<Integer> list = Arrays.asList(10,4,-1,5);
        Collections.sort(list); // [-1, 4, 5, 10]
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]); // output: -1

    }
}
