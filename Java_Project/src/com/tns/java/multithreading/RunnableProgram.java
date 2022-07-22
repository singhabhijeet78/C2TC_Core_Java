//Java program to demonstrate the multuthreading with constructor and life cycle

package com.tns.java.multithreading;

class RunnableClassThread implements Runnable {

	// private fields for Thread and thread name
	private Thread th;
	private String threadName;

	// Constructor
	RunnableClassThread(String name) {
		threadName = name;
		System.out.println(threadName);
	}

	// Thread run method
	public void run() {
		// runs under try catch block to check for exception
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread: " + threadName + ", " + i);

				// thread in sleep for 1 second
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}

		System.out.println("Exiting: " + threadName); // When the thread exists
	}

	public void start() {
		System.out.println("Starting: " + threadName);

		// check to see if thread th is null or not
		if (th == null) {
			th = new Thread(this, threadName); // create a new thread by passing a thread name
			th.start(); // starts the thread
		}
	}
}

//main thread
public class RunnableProgram {

	public static void main(String[] args) {
		// create first object
		RunnableClassThread R1 = new RunnableClassThread("Thread-1");
		R1.start(); // call start function

		// create second object
		RunnableClassThread R2 = new RunnableClassThread("Thread-2");
		R2.start(); // call start function

	}

}