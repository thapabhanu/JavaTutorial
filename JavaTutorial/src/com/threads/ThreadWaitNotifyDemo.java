package com.threads;
public class ThreadWaitNotifyDemo {

	public static void main(String[] args) {
		
		Q q= new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
	}
}

class Q {
	
	int i;
	boolean valueSet = true;

	synchronized public int getI() {
		
		while(!valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("Get - "+i);
			
			valueSet = false;
			notify();
		
		return i;
	}

	synchronized public void setI(int i) {
		
		while(valueSet){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			this.i = i;
			System.out.println("Set - "+i);
			
			
			valueSet = true;
			
			notify();
		
	}
}

class Producer extends Thread{
	
	Q q;
	
	Producer(Q q){
		this.q = q;
		start();
	}
	
	synchronized public void run(){
		int i=1;
		
		while(true){
			q.setI(i++);
		}
	}
}

class Consumer extends Thread{
	
	Q q;
	
	Consumer(Q q){
		this.q = q;
		start();
	}
	
	synchronized public void run(){
		
		while(true){
			q.getI();
		}
	}
}