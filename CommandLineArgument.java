//java CommandLineArgument hello hai 
//filecopy filename1 filename2
public class CommandLineArgument {

	public static void main(String[] args) {
		int a,b,c;
		int arr[]=new int[args.length];
	System.out.println("Main method args length="+args.length);
	for(int i=0;i<args.length;i++)
	{
		arr[i]=Integer.parseInt(args[i]);
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	/*System.out.println(args[0]+args[1]);
	a=Integer.parseInt(args[0]); //NumberFormatException
	b=Integer.parseInt(args[1]);
	c=a+b;
	
	System.out.println("Result ="+c);*/

	}

}
