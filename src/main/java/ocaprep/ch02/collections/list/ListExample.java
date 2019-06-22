package ocaprep.ch02.collections.list;

public class ListExample {

	/*
	 * store an ArrayList in a List reference variable
	 * 
	 * BUT YOU CANNOT
	 * store a List in an ArrayList reference variable
	 * 
	 * because List is an interface and cannot be instanitated
	 */
	public static void main(String[] args) {
		/*
		 * will it compile?
		 * yes
		 */
		java.util.List<String> names = new java.util.ArrayList<String>();

		names.add("Lisa");
		names.add("Kevin");
		names.add("Roger");
		
//		for(String value : values) {
//			System.out.println(value + ", ");
//		}
		
		// getting rid of the last comma (, ) for last value
		//-------------------------------------------------------------------------------- 

		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i)); // getting names 
			String name = names.get(i);
			
			if(i > 0) {
				System.out.println(", ");
			}
			System.out.print(name);
		}
	}
}
