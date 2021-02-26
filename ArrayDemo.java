import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		// int a[10];
		int a[] = { 1, 2, 3, 4, 5 };
		int arr[] = new int[5];
		int b[];
		int i, n;
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter 5 numbers");
		for(i=0;i<5;i++)
		{
			arr[i]=scanner.nextInt();
		}
		System.out.println("enter number of elements");
		n = scanner.nextInt();
		b = new int[n];
		System.out.println("enter " + n + " numbers");
		for (i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		System.out.println("Array size=" + a.length);
		System.out.println("Initialized array");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Input array");
		for (i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
//		for-each (enhanced for loop)
//		 for(datatype variable:arrayname)
//		 {
//			 System.out.println(var);
//		 }
		System.out.println("Traversing the array with for-each loop");
		for (int x : a) {
			System.out.println(x);
		}
		System.out.println(b);
		System.out.println("Before sorting=" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After sorting=" + Arrays.toString(b));

	}

}
