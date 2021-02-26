package com.training.ooc;
//private->default->protected->public
class Vehicle
{
	public void start()
	{
	//final int a=10;
		System.out.println("start a vehicle");
		//a++;
	}
	void stop()
	{
		System.out.println("stop a vehicle");
	}
		
}
class Carr extends Vehicle
{
	 public void start()
	{
		System.out.println("start a car");
	}
	public void stop()
	{
		System.out.println("stop a car");
	}
	}
class Bike extends Vehicle
{
	public void start()
	{
		System.out.println("start a bike");
	}
	void stop()
	{
		System.out.println("start a bike");
	}
	void ride()
	{
		System.out.println("riding a bike");
	}
}

		

public class OverrideDemo {

	public static void main(String[] args) {
//		Carr c=new Carr();
//		c.start();
//		c.stop();
//		Bike b=new Bike();
//		b.start();
//		b.stop();
	
		//Carr c1=new Vehicle();
		//Vehicle obj=new Vehicle();
		Vehicle v=new Carr(); // Dynamic method dispatch(run-time polymorphism)
		v.start();
		v.stop();
		v=new Bike();
		v.start();
		v.stop();
//v.ride();
//		Bike b=new Bike();
//		b.ride();
	
	}

}
