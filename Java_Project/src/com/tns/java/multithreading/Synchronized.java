//Java Program to demonstrate the synchronization in multithreading
package com.tns.java.multithreading;
		//counter class
		class Counter {
			int count;

			// synchronized function
			public synchronized void inc() {
				count++;
			}
		}

		public class Synchronized {

			public static void main(String[] args) throws InterruptedException {

				// create object fot counter class
				Counter c = new Counter();

				// first thread
				Thread t1 = new Thread(new Runnable() {

					@Override
					public void run() {

						for (int i = 1; i <= 10000; i++) {
							c.inc();
						}

					}
				});
				// second thread
				Thread t2 = new Thread(new Runnable() {

					@Override
					public void run() {

						for (int i = 1; i <= 10000; i++) {
							c.inc();

						}

					}
				});

				// calling start and join methods
				t1.start();
				t2.start();
				t1.join();
				t2.join();

				System.out.println(c.count);
	}

}
