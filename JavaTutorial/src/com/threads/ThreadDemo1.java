package com.threads;

/**
 * Main Thread exit before child thread
 * 
 * @author thapabhanu
 *
 */
public class ThreadDemo1 {

	public static void main(String[] args) {

		new MyThread();
		System.out.println("Main Thread Exited");
	}
}

class MyThread extends Thread{
	
	MyThread(){
		start();
	}
	
	public void run(){
		
		try {
			System.out.println("Child Thread Sleeping");
			Thread.sleep(10000);
			System.out.println("Child Thread Wakedup");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}