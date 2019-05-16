package threadPractice;

public class TestThreadByImplementingRunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("thread by implementing Runnable interface is created." + " Thread name: "
				+ Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println("Implementing Runnable interface : " + i);
		}

	}

}
