package ocaprep.ch03;

import java.util.ArrayList;
import java.util.List;

public class ReviewQuestion20 {
    public static void main(String[] args) {
        // what is the result of the following statements
        // compiler error on lin

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
//        list.add(7);// compiler error: not applicable to int

        for(String s : list){
            System.out.println(s);
        }
    }
}
