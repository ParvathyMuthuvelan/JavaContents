package com.training.threads;

public class MainThreadDemo {

	public static void main(String[] args) {
	 Thread t=Thread.currentThread();
	 System.out.println(t);
	 t.setName("Main Thread");
	 t.setPriority(Thread.MAX_PRIORITY);
	 System.out.println("After changing priority ="+t);
	 t.setPriority(11); //IllegalArgumentException
	

	}

}
