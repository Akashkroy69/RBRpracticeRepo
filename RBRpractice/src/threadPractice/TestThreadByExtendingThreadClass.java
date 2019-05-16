package threadPractice;

import java.lang.Thread;

public class TestThreadByExtendingThreadClass extends Thread {

	public TestThreadByExtendingThreadClass(String nameString) {
		super(nameString);
	}

	@Override
	public void run() {

		super.run();/*
					 * If this thread was constructed using a separate Runnable run object, then
					 * that Runnable object's run() method is called; otherwise, this method does
					 * nothing and returns
					 * 
					 */
		System.out.println(
				"thread by extendig Thread class is created. Thread name: " + Thread.currentThread().getName());

		for (int i = 0; i < 5; i++) {

			System.out.println("Etending Thread class: " + i);
		}
		

	}
}
