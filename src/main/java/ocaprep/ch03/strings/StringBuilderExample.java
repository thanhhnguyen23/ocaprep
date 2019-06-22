package ocaprep.ch03.strings;

public class StringBuilderExample {
    public static void main(String[] args) {
//        stringBuilderReverse();
//        reverseStringIteratively();
        reverseRecusively("abc");
    }

    private static void reverseRecusively(String str) {
        // reverse a string recursively without any built-in libraries

        if (str == null || str.length() <= 1){
            System.out.println(str);
        }
        else{
            System.out.print(str.charAt(str.length() - 1));
            reverseRecusively(str.substring(0,str.length() - 1));
        }
    }

    private static void reverseStringIteratively() {
        // reverse a string iteratively without any libraries
//        String s2 = "abc";
//        String reversedString = "";
//
//        s2.toCharArray();
//
//        for(int i = s2.length() - 1; i >= 0; i--){
//            reversedString += s2.charAt(i);
//        }
//        System.out.println(reversedString);
    }

    private static void stringBuilderReverse() {
        // reverse a string using StringBuidler
//        String s = "abcdefghijklmnopqrstuvwxyz";
//
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        System.out.println("original string: " + s + "\nreversed string: " + sb);
    }
}
