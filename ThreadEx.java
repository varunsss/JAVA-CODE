package com.logic;

public class ThreadEx {
	
	public static void main(String[] args) {
		  MyThread thread = new MyThread();
	       // thread.start(); //1
		  thread.run();
		  thread.run(); // 2
		 // thread.start(); //3
	}
}

class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread running");
    }
}