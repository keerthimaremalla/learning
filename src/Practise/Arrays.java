package Practise;

public class Arrays {
	static void printArray(int [] array) {
		int len = array.length;
		for(int i =0;i<len;i++) {
			System.out.print(array[i] + " ");
		}
	}
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,7};
		printArray(a);
		return;
	}
}
