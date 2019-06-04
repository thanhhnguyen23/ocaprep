package ocaprep.ch01;

/*
 * Review Questin 21
 */
public class Salmon{
	/*
	 * what does the following code output?
	 */
    int count;  // instance variables initialize to null by default
    public void Salmon(){
    	/*
    	 * count of type integer (primitive) is assigned to 0
    	 * 		> to retrieve count of 4; must call Salmon() method
    	 */
        count = 4; // when Salmon() method is called, will assign count --> 4
        System.out.println(count);
    }
    public static void main(String[]args){
        Salmon s = new Salmon();
        /*
         * count is a property
         * count of type integer (primitive) is assigned to 0 by default
         */

//        System.out.println(s.count); // 0

        /*
         * Salmon is a method; 
         * Salmon is also the name of the class
         */
        s.Salmon(); // 4
    }
}
