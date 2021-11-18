class Test
{
	int a,b;
	//x=3,y=4
	//a=3,b=4
	void input(int x,int y)
	{
		a=x;
		b=y;
	}
	//arg1=t2.a=3,arg2=t2.b=4
	void change(int arg1,int arg2) //passing primitive
	{
		arg1=arg1+5;//8
		arg2=arg2*2;//8
		System.out.println("In change method a="+arg1+" b="+arg2);
	}
	//temp=t2
	void modify(Test temp) //passing object as argument
	{
		temp.a=temp.a+5;
		temp.b=temp.b*2;
		System.out.println("In modify method a="+temp.a+" b="+temp.b);
	}
	//temp=t1(5,10)
	Test update(Test temp)
	{
		Test result=new Test();
		result.a=++temp.a;
		result.b=++temp.b;
		return result;
		
	}
}
public class PassObjAsArgument {

	public static void main(String[] args) {
	Test t1=new Test();
	Test t2=new Test();
	t2.input(3, 4);
	System.out.println("Before calling method a="+t2.a+" b="+t2.b);
	t2.change(t2.a, t2.b);//8,8
	//t2.modify(t2);//8,8
	System.out.println("After calling method a="+t2.a+" b="+t2.b);
 t1.input(5,10);
    //r=result
 Test r=t1.update(t1);
    
   System.out.println("After calling update method a="+r.a+" b="+r.b); 
	}

}
