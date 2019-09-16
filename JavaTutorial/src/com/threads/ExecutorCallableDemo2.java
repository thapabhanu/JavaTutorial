package com.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallableDemo2 {
	public static void main(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(2);

		Future<String> f = es.submit(new ExecutorCall("Data to Callable"));

		try {
			System.out.println(f.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ExecutorCall implements Callable<String> {
	String s;

	ExecutorCall(String s) {
		this.s = s;
	}

	@Override
	public String call() throws Exception {

		return s;
	}
}
