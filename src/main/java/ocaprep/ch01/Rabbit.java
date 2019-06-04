package ocaprep.ch01;

public class Rabbit {
	/*
	 * Review Question 19
	 */
	// which of the following statements are true

	public static void main(String[] args) {
      Rabbit one = new Rabbit();
      Rabbit two = new Rabbit();
      Rabbit three = one;

      one = null; // garbage collected because one is dereferenced

      Rabbit four = one; // garbage collected because four is referencing a null value
      
      three = null; // garbage collected because three is referencing a null value
      
      two = null; // garbage collected because two is referencing a null value

      two = new Rabbit();
      
      System.gc();

	}
}
