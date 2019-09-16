package com.threads;
public class ThreadJoinDemo12 {

	public static void main(String[] args) {
		
		MyThread2 thread = new MyThread2("1");
		MyThread2 thread1 = new MyThread2("2");
		MyThread2 thread2 = new MyThread2("3");
		try {
			System.out.println("On child Thread calling join()");
			thread.join();
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Thread Exited");
	}
}

class MyThread2 extends Thread{
	
	MyThread2(String name){
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