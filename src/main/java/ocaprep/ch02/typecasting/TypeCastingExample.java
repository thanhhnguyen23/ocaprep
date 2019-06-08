package ocaprep.ch02.typecasting;

public class TypeCastingExample {

	/*
	 * Java compiler converts lower data type to that of a higher data type automatically aka widening a data type
	 *	 
	 * 1. if one of the operands is double data type, the other is promoted to double data type before the operation is carried out
	 * 2. otherwise, if one of the operands is a float data type, the other is promoted to a float data type before operation is carried out
	 * 3. otherwise, if one of the operands is long data type, the other is promoted to long before the operation is carried out
	 * 4. otherwise, if either operand is an integer data type, the other operand is promoted to int
	 * 5. if neither operand is double, float, long or int, both operands are promoted to int	
	 */

	/*
	 * assigning smaller data type to larger data type
	 * widening example
	 * byte > short > int > long
	 */
	public static void main(String[] args) {

		// integral types:
//		byte myByte = 10;
//		short myShort = myByte;
//		int myInteger = myShort;
//		long myLong = myInteger;
//		double myDouble = myLong;

//		System.out.println("my byte: " + myByte);
//		System.out.println("my short: " + myShort);
//		System.out.println("my integer: " + myInteger);
//		System.out.println("my long: " + myLong);
//		System.out.println("my double: " + myDouble);
		
		//-------------------------------------------------------------------------------- 
		// testing
		//-------------------------------------------------------------------------------- 

		// example of integer to double data widening typecasting 
//		int myIntegerThatWillImplicitlyTypecastToDouble = 10;
//		double willIntegerTypeCastToDouble = myIntegerThatWillImplicitlyTypecastToDouble;
//		System.out.println(willIntegerTypeCastToDouble);
	}

}
