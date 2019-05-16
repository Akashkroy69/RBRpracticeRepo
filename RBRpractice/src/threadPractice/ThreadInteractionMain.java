package threadPractice;

/*READ THIS ARTICLE ON INTERTHREAD COMMUNICATION IN JAVA : https://www.geeksforgeeks.org/inter-thread-communication-java*/
public class ThreadInteractionMain {

	public static void main(String[] args) throws InterruptedException {
		ThreadInteractionCalculator objCalculator = new ThreadInteractionCalculator();

		ThreadInteractionReader objInteractionReader = new ThreadInteractionReader(objCalculator);

		objInteractionReader.start();

		objCalculator.start();

		//objInteractionReader.join();
		/*
										 * this will help the other threads main and thread related to
										 * objCalculator to go into wait state. so that through this thread we could
										 * call wait on this thread first which leads thread related to objCalculator to
										 * start operating which later when completes the for loop or calculation and
										 * when it notify() then that notify would invokes this thread to come back and
										 * start operating.
										 */

	}

}
