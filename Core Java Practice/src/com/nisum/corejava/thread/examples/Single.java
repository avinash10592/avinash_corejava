/**
 * 
 */
package com.nisum.corejava.thread.examples;

/**
 * @author Nisum
 *
 */
class Single extends Thread {
	public void run() {

		for (int loop = 0; loop <= 4; loop++) {
                System.out.println("Child Thread"); 
			// Sleep() method
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(loop);

		}
	}

}

class SingleThread {
	public static void main(String[] args) {
		Single obj1 = new Single();
		Single obj2 = new Single();
		
		// setDaemon() method
		obj1.setDaemon(true);
		obj1.start();
		obj2.setDaemon(true);
		obj2.start();
		System.out.println("End of main Thread");
		// getId() method
		System.out.println("ID=" + obj1.getId());

		// getName() method
		System.out.println("name of the Thread" + obj1.getName());

		// setName() method
		obj1.setName("avinash");
		System.out.println("name of the Thread after changing the name " + obj1.getName());

		// getPriority() method
		System.out.println("Priority of the thread=" + obj1.getPriority());

		// setPriority() method
		obj1.setPriority(8);
		System.out.println("Priority of the thread after changing=" + obj1.getPriority());

		// isAlive() method
		obj1.start();
		System.out.println("Thread1 status=" + obj1.isAlive());

		// join() method
		try {
			obj1.join();
		} catch (Exception e) {

		}
		System.out.println("thread1 status=" + obj1.isAlive());
		obj2.start();
		System.out.println("thread2 status=" + obj2.isAlive());

	}

}
