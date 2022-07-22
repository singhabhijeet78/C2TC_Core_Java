//Java program to demonstarte the use of join and sleep in Mutithreading
package com.tns.java.multithreading;
		
class ChildThread extends Thread {

			// thread run method
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("This is child thread");

					try {
						Thread.sleep(3000); // will run after 3 sec
					} catch (InterruptedException e) {
					}
				}

				System.out.println("Running Thread");
			}
		}

		public class JoinDemo {

			public static void main(String[] args) throws InterruptedException {

				// create an objec
				ChildThread c = new ChildThread();
				c.start(); // starting the thread
				c.join(2000); // ChildThread wants to wait

				for (int i = 0; i < 10; i++)
					System.out.println("Main Thread");

	}

}
