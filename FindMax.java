
public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 10, c = 2;
		//Maximum of 2 numbers
//		if (a > b ) {
//			System.out.println("Maximum =" + a);
//		} else {
//			System.out.println("Maximum =" + b);
//		}
//Maximum of 3 numbers
		if(a>b && a>c)
		{
			System.out.println("Maximum =" + a);
		}
		else if(b>a && b>c)
		{
			System.out.println("Maximum =" + b);
		}
	
		else
		{
			System.out.println("Maximum =" + c);
		}
		
	}

}
