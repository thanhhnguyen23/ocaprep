package ocaprep.ch01;

public class WaterBottle {
	private String brand; // Strings are null by default
	private Boolean empty; // booleans are false by default

	/*
	 * what about other data types?
	 * 		> Booleans are the only data type that initialized to false by default
	 */

	/*
	 * instance variables defaults to null
	 */
//	private Short dt_short; 	// null
//	private Byte dt_byte; 		// null
//	private Integer dt_integer; // null
//	private Long dt_long; 		// null
//	private Float dt_float;		// null
//	private Double dt_double; 	// null

	public static void main(String[] args) {
		/*
		 * local variables inside main method must be initialized; null by default including boolean
		 * 		> unlike boolean instance variables, where booleans are initialized to false
		 */
//      Short dt_short = null;
//      Byte dt_byte = null;
//      Integer dt_integer = null;
//      Long dt_long = null;
//      Float dt_float = null;
//      Double dt_double = null;
      Boolean dt_boolean = null;
//      String dt_string = null;

		WaterBottle wb = new WaterBottle();


    //-------------------------------------------------------------------------------- 
    // testing
    //-------------------------------------------------------------------------------- 

    //		System.out.print("Empty = " + wb.empty);
    //		System.out.print(", Brand = " + wb.brand);
    //		System.out.println("Short: " + wb.dt_short);
    //		System.out.println("Byte: " + wb.dt_byte);
    //		System.out.println("Integer: " + wb.dt_integer);
    //		System.out.println("Long: " + wb.dt_long);
    //		System.out.println("Float: " + wb.dt_float);
    //		System.out.println("Double: " + wb.dt_double);

		System.out.println(dt_boolean);
	}
}
