package threadPractice;

public class ProucerConsumerMain {

	public static void main(String[] args) throws InterruptedException {

		final ProducerConsumer producerConsumer = new ProducerConsumer();

		// Create a thread object that calls pc.produce()
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					producerConsumer.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		// Create another thread object that calls
		// pc.consume()
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {

				try {
					producerConsumer.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}
}
