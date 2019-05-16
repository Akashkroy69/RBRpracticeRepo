package threadPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import oops.Main;

//import javax.sound.sampled.LineListener;

/*
 * 
 * 
 * A blocking queue is a queue that blocks when you try to dequeue from it and the 
 * queue is empty, or if you try to enqueue items to it and the queue is already full. 
 * A thread trying to dequeue from an empty queue is blocked until some other thread inserts 
 * an item into the queue. A thread trying to enqueue an item in a full queue is blocked until 
 * some other thread makes space in the queue, either by dequeuing one or more items or clearing the 
 * queue completely.
Note: Java 5 comes with blocking queue implementations in the java.util.concurrent package

*/
public class BlockingQueue {
	List<Integer> queue = new <Integer>LinkedList();
	int limit = 5;

	public BlockingQueue(int limitsize) {
		this.limit = limitsize;
	}

	/*
	 * public synchronized void enqueue(int item) throws InterruptedException { if
	 * (this.queue.size()==this.limit) { wait();
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
	public static void main(String[] args) throws InterruptedException {
		
		BlockingQueue blockingQueueObj=new BlockingQueue(5);
		BlockingQueueEnque blockingQueueEnqueObj=new BlockingQueueEnque(blockingQueueObj);
		BlockingQueueDeque blockingQueueDequeObj=new BlockingQueueDeque(blockingQueueObj);
		//2 Threads instances has also been created by the above lines.
		//Now by following lines the thread will come into picture and will get their call-stack.
		
		/*
		 * blockingQueueEnqueObj.start(); blockingQueueDequeObj.start();
		 */
		
		//testing --------------->//conclusion: The following code will work as simple methods. will not get any thread effect.
		/*blockingQueueEnqueObj.enqueue(5);
		int itemrecieved = blockingQueueDequeObj.dequeue();
		System.out.println(itemrecieved);*/
		String enqueOrdequeString;
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("Do you want to enque or dequeue(answer in E or D): ");
			enqueOrdequeString=scanner.nextLine();
			if (enqueOrdequeString.equals("E")||enqueOrdequeString.equals("e")) {
				System.out.println("Enter the number: ");
				int item=scanner.nextInt();
				blockingQueueEnqueObj.settingitem(item);
				blockingQueueEnqueObj.start();
			}
			else if (enqueOrdequeString.equals("D")||enqueOrdequeString.equals("d")) {
				blockingQueueDequeObj.start();
			} 
			else {
				System.out.println("Wrong choice. Enter Again.");
				continue;
			}
				
			
			
		}
		
	}

}
