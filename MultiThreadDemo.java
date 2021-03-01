package com.training.threads;

class ChildThread extends Thread {
	ChildThread() {
		setName("Child Thread 1");
		setPriority(10);
	}

//	public void run() // task of the thread
//	{
//		Thread t = Thread.currentThread();
//		System.out.println("Child trhead 1 ="+t);
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(t.getName() +" "+i); //running state
//			System.out.println("Thread is running "+t.isAlive());
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				System.out.println(e.getMessage());
//			}
//		}
//	}
}

class ChildThreadTwo extends Thread {
	ChildThreadTwo() {
		setName("Child Thread 2");
		setPriority(4);
	}

	public void run() // task of the thread
	{
		Thread t = Thread.currentThread();
		System.out.println("Child trhead 2 ="+t);
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() +" "+i); //running state
			System.out.println("Thread is running "+t.isAlive());
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class MultiThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("Main thread");
		ChildThread thread1 = new ChildThread();// new born state
		thread1.start();//Thread moves to the runnable state
//		ChildThreadTwo thread2 = new ChildThreadTwo();// new born state
//		thread2.start();
		//thread2.start();//IllegalThreadStateException
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
