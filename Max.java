import java.util.Scanner;
class Max
{
public static void main(String [] args)
{
Scanner scanner=new Scanner(System.in);
int a,b,c;
System.out.println("enter 3 numbers");
a=scanner.nextInt();
b=scanner.nextInt();
c=scanner.nextInt();
if(a>b && a>c)
{
System.out.println("Maximum is ="+a);
}
else if(b>a && b>c)
{
System.out.println("Maximum is ="+b);
}
else
{
System.out.println("Maximum is ="+c);
}
}
}