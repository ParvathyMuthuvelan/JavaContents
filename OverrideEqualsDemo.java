package com.training.ooc;
class Product
{
	int code;
	String name;
	Product(int code,String name)
	{
		this.code=code;
		this.name=name;
	}
	//p1.equals(p2)
	//p2.equals(p3)
	//obj=p2
	public boolean equals(Object obj)
	{
		boolean result=false;
		Product temp=(Product)obj;
		
		if(this.code == temp.code && this.name.equals(temp.name))
		{
			result=true;
		}
		return result;
	}
	public int hashCode()
	{
		int hcode;
		hcode=code+name.length();
		return hcode;
		
	}
	@Override
	public String toString() {
		return String.format("Product [code=%s, name=%s]", code, name);
	}
	
	
	
}
public class OverrideEqualsDemo {
	public static void main(String[] args) {
		Product p1=new Product(100,"p1");
		Product p2=new Product(100,"p1");
		Product p3=new Product(101,"p2");
		System.out.println("p1 equals p2="+p1.equals(p2) +" hashcode of p1="+p1.hashCode()+"p2="+p2.hashCode());
		System.out.println("p1 equals p3="+p1.equals(p3)+" hashcode of p1="+p1.hashCode()+"p3="+p3.hashCode());
		System.out.println(p1);
	}

}
