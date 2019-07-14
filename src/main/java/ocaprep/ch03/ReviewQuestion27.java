package ocaprep.ch03;

import java.util.ArrayList;
import java.util.List;

public class ReviewQuestion27 {
    public static void main(String[] args) {
        // what is the result of the following
        List<String> one = new ArrayList<>();
        one.add("abc");
        List<String> two = new ArrayList<>();
        two.add("abc");

        if(one == two) System.out.println("A");
        else if(one.equals(two)) System.out.println("B"); // output: B
        else System.out.println("C");
    }
}
