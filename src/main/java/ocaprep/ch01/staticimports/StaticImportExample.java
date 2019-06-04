package ocaprep.ch01.staticimports;

// needed to use sqrt with Math.* prefix
import static java.lang.Math.*;

// needed to use out. with System.* prefix
import static java.lang.System.*;

public class StaticImportExample{
	/*
	 * static import allows you to access the static member of a class directly without using the fully qualified name
	 */
	public static void main(String[] args) {

		// instead of Math.sqrt need to use only sqt
		double var1 = sqrt(5.0);
		
		// instead of Math.tan need to use only tan
		double var2 = tan(30);
		
		// need not to use System in both the bewlow statements
		
		out.println("Square of 5 is: " + var1);
		
		out.println("Tan of 30 is: " + var2);
	}
}
