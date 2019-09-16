package com.threads;
/**
 * The main thread exit after child thread is complete.
 * For this call join method on child thread
 * 
 * @author thapabhanu
 *
 */
public class ThreadJoinDemo11 {

	public static void main(String[] args) {
		
		MyThread1 thread = new MyThread1("1");
		try {
			System.out.println("On child Thread calling join()");
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exited");
	}
}

class MyThread1 extends Thread{
	
	MyThread1(String name){
		super(name);
		start();
	}
	
	public void run(){
		
		try {
			System.out.println("Child Thread"+this.getName()+" Sleeping");
			Thread.sleep(10000);
			System.out.println("Child Thread"+this.getName()+" Wakedup");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}