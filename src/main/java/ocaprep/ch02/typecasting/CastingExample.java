package ocaprep.ch02.typecasting;

public class CastingExample {
	public static void main(String[] args) {
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		
		String[] againstStrings = (String[]) objects;
		
		/*
		 * againstStrings array only allows string objects
		 * 		> StringBuilder is NOT a string
		 */
//		againstStrings[0] = new StringBuilder(); // does not compile
		
		/*
		 * StringBuilder object can clearly go in an Object[]
		 * 		> problem is that we do not have an Object[]
		 * 		> we have a String[] referred to from an Object[] variable
		 * 		> will throw ArrayStoreException
		 * 
		 */
		objects[0] = new StringBuilder();
		System.out.println(objects[0]); // ArrayStoreException
	}

}
