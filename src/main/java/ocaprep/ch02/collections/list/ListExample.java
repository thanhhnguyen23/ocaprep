package ocaprep.ch02.collections.list;

public class ListExample {

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
		
		//-------------------------------------------------------------------------------- 
		//TODO -- come back to check to see what's wrong with debugger?
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
