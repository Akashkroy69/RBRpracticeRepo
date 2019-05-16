package threadPractice;

public class TestMultiplaThread implements Runnable {

	@Override
	public void run() {
		int count = 0;

		for (int i = 0; i < 3; i++) {
			System.out.println("Run by " + Thread.currentThread().getName() + " and count is " + count++);
		}
		// System.out.println("----------------------------------------------------");

	}

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------\n"
				+ "before creating Thread object, Current Thread : " + Thread.currentThread().getName() + "\n"
				+ "-----------------------------------------------------\n\n");
		TestMultiplaThread objMultiplaThread = new TestMultiplaThread();
		Thread oneObjThread = new Thread(objMultiplaThread, "First Thread");// , "first thread");
		Thread twoObjThread = new Thread(objMultiplaThread, "Second Thread");// , "second thread");
		Thread threeobjThread = new Thread(objMultiplaThread, "Third Thread");// , "third thread");
		// instead of using these thread parameterized constructor we can use setName()
		// method of Thread class
		// after creating thread object.

		/// from following lines 3 concurrent thread gets started. along with that
		// main thread is already running now.
		// System.out.println("---------------------------------------------------------");
		oneObjThread.start();
		twoObjThread.start();
		threeobjThread.start();

		// System.out.println("---------------------------------------------------------");

	}
}
