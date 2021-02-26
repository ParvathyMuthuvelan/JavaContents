import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
	
		int i,j,k,n,fact=1;
		Scanner scanner=new Scanner(System.in);
		for( i=1;i<=10;i++)
		{
			System.out.print(i + "\t");
		}
		System.out.println();
		for(i=10;i>=1;i--)
		{
			System.out.print(i + "\t");
		}
		System.out.println();
		for( i=0;i<=10;i+=2)
		{
			System.out.print(i + "\t");
		}
		System.out.println();
		System.out.println("Enter a number");
		n=scanner.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+"= "+fact);
		//Nested for loop
		
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=2;j++)  //i=1,j=1,j=2 ,i=2,j=1,j=2,i=3,j=1,j=2
			{
				for(k=1;k<=2;k++)
				{
				System.out.println("i="+i+", j="+j+", k="+k);
				}
			}
		}
		
	}

}
