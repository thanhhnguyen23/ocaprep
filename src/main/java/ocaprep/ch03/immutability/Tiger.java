package ocaprep.ch03.immutability;

public class Tiger {
	public static void main(String[] args) {
		
	/*
	 * never use == to compare String objects
	 * equals() method check the values inside the String rather than the String itself
	 */

		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		Tiger t3 = t1;
		
		/*
		 * comparing references to the same object
		 */
		System.out.println(t1 = t1); // true
		/*
		 * references are different
		 */
		System.out.println(t1 = t2); // false

		/*
		 * Tiger t1 doesn't implement equals() method
		 */
		System.out.println(t1.equals(t2)); // false; 
		
		
	}
}
