package threadPractice;

public class BlockingQueueDeque extends Thread {

	private BlockingQueue blockingQueueObj;
	private int item;

	public BlockingQueueDeque(BlockingQueue blockingQueueObj) {
		this.blockingQueueObj = blockingQueueObj;
		
	}
	
	
	@Override
	public void run() {
		
		super.run();
		try {
			item=dequeue();
			System.out.println("Here is the item dequeued. "+item+" Now the \nlimit of the queue is : "+blockingQueueObj.queue.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public synchronized int dequeue() throws InterruptedException
	{
		if (blockingQueueObj.limit==0) {
			System.out.println("Queue is already empty and it can't be dequeued. Waiting it to be inqueued.");
			wait();
		}
		if (blockingQueueObj.queue.size()==blockingQueueObj.limit) {
			System.out.println("The queue has become full.Notifying all threads to get activated for dequeueing.");
			notifyAll();
		}
		System.out.println("Item is being removed. Get ready to catch it.");
		return blockingQueueObj.queue.remove(0);
	}

}
