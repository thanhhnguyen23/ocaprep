package ocaprep.ch03.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		/*
		 * add() method
		 */
		// example 1
		// ArrayList list = new ArrayList();
		// list.add("hawk");
		// list.add(Boolean.TRUE);
		// System.out.println(list);

		// example 2
		// ArrayList<String> safer = new ArrayList<>();
		// safer.add("sparrow");
		// /*
		// * compiler enforces String objects and prevents any other types of objects in
		// the ArrayList
		// */
		//// safer.add(Boolean.TRUE); // DOES NOT COMPILE

		// example 3
		// List<String> birds = new ArrayList<>();
		// birds.add("hawk");
		// birds.add(1, "robin");
		// birds.add(0, "blue jay");
		// birds.add(1, "cardinal");
		// System.out.println(birds);

		/*
		 * remove() method removes the first matching value or remove the element at a
		 * specified index
		 */
		// example 1
		// List<String> birds = new ArrayList<>();
		// birds.add("hawk");
		// birds.add("hawk");
		// System.out.println(birds);
		// System.out.println(birds.remove("cardinal")); // prints false
		// System.out.println(birds.remove("hawk")); // prints true
		// System.out.println(birds.remove(0)); // prints hawk
		// System.out.println(birds); // prints hawk

		/*
		 * set() method changes one of the elements of the ArrayList without changing
		 * the size
		 */
		// List<String> birds = new ArrayList<>();
		// birds.add("hawk");
		// System.out.println(birds.size()); // 1
		// // birds.set(0, "robin");
		// System.out.println(birds.size()); 
		// birds.set(1, "robin"); // IndexOutOfBoundsException

		/*
			isEmpty() and size() methods look at how many of the slots are in use
				> isEmpty() returns a boolean
				> size() returns int
		 */
		// List<String> birds = new ArrayList<>();
		// System.out.println(birds.isEmpty()); // true
		// System.out.println(birds.size()); // 0
		// birds.add("hawk");
		// birds.add("hawk");
		// System.out.println(birds.isEmpty()); // false
		// System.out.println(birds.size()); // 2
		/*
			clear() method provides an easy way to discard all elements of the ArrayList
		 */
//		List<String> birds = new ArrayList<>();
//		birds.add("hawk");
//		birds.add("hawk");
//		System.out.println(birds.isEmpty()); // false
//		System.out.println(birds.size()); // 2
//		birds.clear();
//		System.out.println(birds.isEmpty()); // true
//		System.out.println(birds.size());  // 0
		
		/*
			contains() method checks whether a certain value is in the ArrayList
		 */
//		List<String> birds = new ArrayList<>();
//		birds.add("hawk");
//		System.out.println(birds.contains("hawk")); // true
//		System.out.println(birds.contains("robin")); // false


		/*
			equals() method compare two lists to see if they contain the same elements in the same order
		 */
//		List<String> one = new ArrayList<>();
//		List<String> two = new ArrayList<>();
//
//		System.out.println(one.equals(two)); // true
//		one.add("a");
//		System.out.println(one.equals(two)); // false
//		two.add("a");
//		System.out.println(one.equals(two)); // true
//		one.add("b");
//		two.add(0,"b");
//		System.out.println(one.equals(two)); // false

	}
}
