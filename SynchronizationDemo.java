package com.training.threads;

class Resource {
synchronized static void show(String s) 
	{
		for (int i = 1; i <= 5; i++) {
			System.out.println(s + " " + i);
		}
	}
}

	class CThread extends Thread {
		CThread()
		{
			setName("Child Thread");
		}
		public void run()
		{
			Thread t=Thread.currentThread();
			Resource.show(t.getName());
		}
	}
	

public class SynchronizationDemo {

	public static void main(String[] args) {
	  CThread thread=new CThread();
	  thread.start();
	  Thread t=Thread.currentThread();
	  t.setName("Main thread");
	  Resource.show(t.getName());
	  

	}

}
