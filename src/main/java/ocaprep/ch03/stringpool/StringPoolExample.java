package ocaprep.ch03.stringpool;

public class StringPoolExample{
    public static void main(String[] args) {
        /*
            uses string pool automatically
         */
        String n1 = "Fluffy"; 
        /*
            explicitly telling the java compiler not to use string pool
         */
        String n2 = new String("Fluffy");
    }
}
