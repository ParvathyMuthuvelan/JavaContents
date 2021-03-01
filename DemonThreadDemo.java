package com.training.threads;
class DaemonThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Running......");
		}
	}
}
public class DemonThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main started");
		DaemonThread thread=new DaemonThread();
	thread.setDaemon(true);
		thread.start();
		

	}

}
