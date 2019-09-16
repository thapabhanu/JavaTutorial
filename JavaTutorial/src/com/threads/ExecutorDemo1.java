package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {
public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(2);
		
		es.execute(new ExecutorThread());
		
	}
}

class ExecutorThread implements Runnable{
	Thread t;
	
	ExecutorThread(){
		this.t = new Thread(this);
	}
	
	@Override
	public void run() {
		
		
	}

}