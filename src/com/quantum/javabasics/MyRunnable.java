package com.quantum.javabasics;

public class MyRunnable implements Runnable {
	
	
	String name;
	public MyRunnable(String name) {
	 
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Start thread "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Ended thread "+name);

	}

}
