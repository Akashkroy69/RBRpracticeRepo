package threadPractice;

public class BlockingQueueEnque extends Thread {
	private BlockingQueue blockingQueueObj;
	private int item;

	public BlockingQueueEnque(BlockingQueue blockingQueueObj) {
		this.blockingQueueObj = blockingQueueObj;
		// TODO Auto-generated constructor stub
	}

	public void settingitem(int item) {
		this.item = item;
	}

	@Override
	public void run() {

		super.run();
		
		try {
			enqueue();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void enqueue() throws InterruptedException {
		if (blockingQueueObj.queue.size() == blockingQueueObj.limit) {
			System.out.println("The queue is full. Can't add now. Waiting for sapace to\nbe made by any other Thread.");
			wait();
		}
		if (blockingQueueObj.limit == 0) {
			System.out.println("Queue has become empty. Notifying threads to come and fill the queue.");
			notifyAll();

		}
		System.out.println(item + " Item is being added.");
		blockingQueueObj.queue.add(item);
	}

}
