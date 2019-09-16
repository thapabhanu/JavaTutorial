package com.threads;


public class ThreadJoinDemo13 {

	public static void main(String[] args) {
		
		MyThread3 thread = new MyThread3("1", 10000);
		MyThread3 thread1 = new MyThread3("2", 0);
		MyThread3 thread2 = new MyThread3("3", 0);
		try {
			System.out.println("On child Thread calling join()");
			thread.join();
			//thread1.join();
			//thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exited");
	}
}

class MyThread3 extends Thread{
	
	int sleepTime = 0;
	MyThread3(String name, int sleepTime){
		super(name);
		this.sleepTime = sleepTime;
		start();
		
	}
	
	public void run(){
		
		try {
			System.out.println("Child Thread"+this.getName()+" Sleeping");
			Thread.sleep(sleepTime);
			System.out.println("Child Thread"+this.getName()+" Wakedup");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}