package ocaprep.ch03;

import java.util.ArrayList;

public class ReviewQuestion17 {
    public static void main(String[] args) {
        // which of these compile when replacing line 8
        ArrayList l = new ArrayList();

//        int length = l.capacity; // does not compile
//        int length = l.capacity(); // does not compile
//        int length = l.length; // does not compile
//        int length = l.length(); // does not compile
//        int length = l.size; // does not compile

        int length = l.size(); // does compile

    }
}
