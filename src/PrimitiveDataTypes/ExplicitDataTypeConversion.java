package PrimitiveDataTypes;

public class ExplicitDataTypeConversion 
{
	public static void main(String args[]) {
		double d = 50.50;
		System.out.println(d);
		float f = (float)d;
		System.out.println(f);
		long b = (long)f;
		System.out.println(b);
		int c = (int)b;
		System.out.println(c);
	}
}
