package ocaprep.ch03;

import java.util.ArrayList;

public class ReviewQuestion19 {
    public static void main(String[] args) {
        // which of the following are true

//        System.out.println(twoArrays());
        System.out.println(twoArrayList());
    }
    // two ArrayLists with the same content are equal
    private static boolean twoArrayList(){
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        B.add(1);
        B.add(2);
        B.add(3);
        B.add(4);
        B.add(5);

//        return A == B ? true : false; // return false
        return A.equals(B) ? true : false; // return true
    }
    // two arrays with the same content are equal; // false
    private static boolean twoArrays(){

        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};

        return a == b ? true : false; // return false;
//        return a.equals(b) ? true : false; // return false;
    }
}
