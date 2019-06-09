package ocaprep.ch01.orderofinitialization;

public class OrderOfInitializationExample {
	/*
	 * order of initialization
	 * 
	 * 1. fields and instance initializer blocks are run in the order in which they
	 * appear in the file
	 * 
	 * 2. constructor runs after all fields and instance initializer blocks have run
	 */

	private String name = "Fluffy";

	{
		System.out.println("setting the field"); // name: Fluffy
	}

	public static void main(String[] args) {
		OrderOfInitializationExample ooie = new OrderOfInitializationExample();
		System.out.println(ooie.name);
	}

	public OrderOfInitializationExample() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	/*
	 * output: 	setting the field
	 * 			setting the constructor
	 * 			Tiny
	 */

}
