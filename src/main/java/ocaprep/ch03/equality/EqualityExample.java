package ocaprep.ch03.equality;

public class EqualityExample {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder(); // object: one
        StringBuilder two = new StringBuilder(); // object: two

        StringBuilder three = one.append("a");
        
        System.out.println(one == two); // false
        System.out.println(one == three); // true
    }
}