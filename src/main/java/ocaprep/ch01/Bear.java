package ocaprep.ch01;

/*
 * Review Question 20
 */
public class Bear {
    // what is true about the following code?
    protected void finalize(){
        System.out.println("Roar!"); // finalize() method has been called
    }
    public static void main(String[]args){
        Bear bear = new Bear(); // initializing bear variable of type Bear
        bear = null; // assigning bear to null; which triggers bear variable for garbage collection
        System.gc(); // will trigger finalize() method to be called
    }
}
