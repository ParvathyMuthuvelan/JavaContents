import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		int i, n,max=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of elements");
		n = scanner.nextInt();
		a= new int[n];
		System.out.println("enter " + n + " numbers");
		for (i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum="+max);
	}

}
