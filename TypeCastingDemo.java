class TypeCastingDemo
{
public static void main(String []args)
{
int a=130,b;
byte c,d=40;
char ch='A';
double x=67.89,y;
float z;
float a1=89.67f;
long var=123456700000000L;
System.out.println("Implicit casting");
b=d;
System.out.println("byte assigned to int="+b);
z=a;
System.out.println("int assigned to float="+z);
b=ch;
System.out.println("char assigned to int="+b);
System.out.println("Explicit casting");
c=(byte)a;
System.out.println("int assigned to byte="+c);
a=(int)a1;
System.out.println("float assigned to int="+a);
}
}