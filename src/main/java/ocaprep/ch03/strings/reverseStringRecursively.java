package ocaprep.ch03.strings;

public class reverseStringRecursively {

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String reversed = reverse(str);
        System.out.println(reversed);
    }

    public static String reverse(String str){
        if(str.isEmpty()) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
