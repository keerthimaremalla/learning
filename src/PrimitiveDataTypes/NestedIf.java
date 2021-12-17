package PrimitiveDataTypes;

public class NestedIf {
	public static void main(String args[]) {
		int a = 50;
		if (a == 50) {
			System.out.println("A is equal to 50");
			if (a < 55) {
				System.out.println("A is less than 55");
				if (a < 75) {
					System.out.println("A is less than 75");
				}
			}
		}
	}
}
