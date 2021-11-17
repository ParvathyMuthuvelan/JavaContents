class Operators
{
static void display()
{
System.out.println("display method called");
}
public static void main(String[] args )
{
//Operators obj=new Operators();
//obj.display();
//display();
int a=5;
int b=10,c;
c=a+b;
int res=(a>b)?a:b;
System.out.println("Sum="+c);
System.out.println("Maximum="+res);
}
}