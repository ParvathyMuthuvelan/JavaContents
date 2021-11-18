import java.util.Scanner;

public class TwodArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,3,4},{2,4,5}};
		int b[][];
		int rows,cols,i,j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of rows and cols");
		rows = scanner.nextInt();
		cols = scanner.nextInt();
		b = new int[rows][cols];
		System.out.println("enter " + rows*cols + " numbers");
		for (i = 0; i < rows; i++) 
		{
			for(j=0;j<cols;j++)
			{
			b[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Array elements");
		for (i = 0; i < rows; i++) 
		{
			for(j=0;j<cols;j++)
			{
			System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		}

}
