package ocaprep.ch03;

import java.util.ArrayList;
import java.util.List;

public class ReviewQuestion21 {
    public static void main(String[] args) {
        // what is the result of the following statements
        List<Integer> values = new ArrayList<>();

        values.add(4); // values = [4]
        values.add(5); // values = [4,5]
        values.add(1,6); // values = [4,6,5]

        values.remove(0); // values = [6,5]

        for(Integer v : values){
            System.out.println(v);
        }

    }
}
