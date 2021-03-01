package com.training.threads;

class ChildThreadd  extends Thread implements Runnable {

//	@Override
//	public void run() {
//		//setName();
//		System.out.println("Child thread running ");
//		Thread t = Thread.currentThread();
//		System.out.println("Child trhead 1 =" + t);
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(t.getName() + " " + i); // running state
//			System.out.println("Thread is running " + t.isAlive());
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//
//		}

	//}
}

public class RunnableDemo {

	public static void main(String[] args) {
	ChildThreadd obj=new ChildThreadd();
	obj.start();
	Thread t=Thread.currentThread();
	Thread thread=new Thread(obj);
	thread.setName("Child Thread 1");
	thread.setPriority(8);
	thread.start();
	//thread.run();
	for (int i = 1; i <= 5; i++) {
		System.out.println( t.getName() + " " +i);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
}
