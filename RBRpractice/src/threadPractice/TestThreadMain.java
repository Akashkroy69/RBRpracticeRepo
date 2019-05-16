package threadPractice;

public class TestThreadMain {
	public static void main(String[] args) {

		System.out.println("Main thread is started here.");

		// code for creating thread for TestThreadByExtendingThreadClass

		TestThreadByExtendingThreadClass objExtendingThreadClass = new TestThreadByExtendingThreadClass(
				"Thread class thread1");

		objExtendingThreadClass.start();
		// objExtendingThreadClass.start();

		// code for creating thread for TestThreadByImplementingRunnableClass

		TestThreadByImplementingRunnableInterface objByImplementingRunnableInterface = new TestThreadByImplementingRunnableInterface();

		// Here constructor Thread(Runnable targetObjectinstance) is being initiated.
		Thread threadobj = new Thread(objByImplementingRunnableInterface, "Runnable Thread1");

		threadobj.start();

		/// using the 4 constructors which has been provided by class Thread
		/*
		 * 1.Thread(Runnable target) is being used in LINE: 20 2.Thread() is being
		 * invoked through LINE: 10(internally) 3.Thread(Runnable target,String name)
		 * could have been used for naming the thread for which constructor has been
		 * invoked in LINE: 20 4.Thread(String string) coud have been used to name the
		 * thread which has been invoked in line 10
		 * 
		 */

	}

}
