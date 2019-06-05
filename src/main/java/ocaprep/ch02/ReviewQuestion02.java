package ocaprep.ch02;

public class ReviewQuestion02 {
	public static void main(String[]args){
        /*
         * what data types (or types) will allow the following code snippet to compile?
         */

		/*
    	 * byte is the smallest Java integer type
    	 * byte is a 8 bit signed type ranges from -128 to 127
    	 * byte is mostly used when dealing with raw data such as reading binary files
    	 * 
    	 * byte is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer
    	 * 
		 */
    	
		/*
		 * Java Auto Type Promotion
		 * Java allows integer type promotion (byte, short, int, and long from smallest to largest)
		 */
        byte x = 5; 
        byte y = 10;

        /*
         * byte operands are automatically promoted to int 
         */
//        int z = x + y; 

//        long z = x + y; // seems to work, because it's an integer type

//        boolean z = x + y; // cannot convert int to boolean; due to Java's Auto Type Promotion

        /*
         * implicit type conversion -> int to double
         * 
         * since the return type is double, bytes are automatically promoted to int, operation is carried out(arithmetic in this case) and widened to fit the return type (double data type)
         */

        double z = x + y; 

//        short z = x + y; // cannot convert int to short; due to Java's Auto Type Promotion
//        byte z = x + y; // cannot convert int to byte; due to Java's Auto Type Promotion

        // ------------------
        // testing
        // ------------------
        System.out.println(z);

    }
}
