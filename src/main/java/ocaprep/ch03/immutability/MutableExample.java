package ocaprep.ch03.immutability;

public class MutableExample {
    private String s;
    public void setS(String newS){ s = newS; } // setter makes it mutable

    public String getS(){ return s; }
}
final class Immutable{
    /*
        immutable only has a getter
     */
    private String s = "name";
    public String getS(){ return s; }
}
