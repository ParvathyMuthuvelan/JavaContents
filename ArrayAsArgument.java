import java.util.Scanner;

public class ArrayAsArgument {
	int[] change(int arr[])
	{
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i]*arr[i];
		}
		return temp;
	}
	//arr=a(address)
	void modify(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]+=5;
		}
		System.out.println("In modify method array values");
		for (int x : arr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int a[],n,i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of elements");
		n = scanner.nextInt();
		a = new int[n];
		System.out.println("enter " + n + " numbers");
		for (i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		ArrayAsArgument obj=new ArrayAsArgument();
		System.out.println("Before calling method array values");
		for (int x : a) {
			System.out.println(x);
		}
		obj.modify(a);
		System.out.println("After calling method array values");
		for (int x : a) {
			System.out.println(x);
		}
		//res=temp
		int res[]=obj.change(a);
		System.out.println("After calling change method array values");
		for (int x : res) {
			System.out.println(x);
		}
	}

}
