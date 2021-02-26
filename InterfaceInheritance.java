package com.training.ooc;
interface inter1
{
	void method1();
	void method2();
	//void method3();
}
interface inter2 extends inter1
{
	void method3();
}
class G implements inter2
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
}
class F implements inter2
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	}
class E implements inter1
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}}
class D implements inter1
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}}
public class InterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter1 ref1=new G();
		ref1.method1();
		ref1.method2();
		inter2 ref2=new F();
		ref2.method1();
		ref2.method2();
		ref2.method3();
		

	}

}

