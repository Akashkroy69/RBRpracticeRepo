package threadPractice;
/*READ THIS ARTICLE ON INTERTHREAD COMMUNICATION IN JAVA : https://www.geeksforgeeks.org/inter-thread-communication-java*/
public class ThreadInteractionCalculator extends Thread{
	public int total = 0;
	public boolean threadInteractionCalculatorExcecutedFirst=false;
	

	public void run() {
		/*Both the threads are performing synchronization on the same instance of class 
        ThreadInteractionCalculator. here by passing this reference
        
        And in ThreadInteractionReader class by passing calculatorObj.
        */
		synchronized (this) {
			
			threadInteractionCalculatorExcecutedFirst=true;
			for (int i = 0; i < 5; i++) {
				total += i;
			}

			notify(); //It will notify the thread in waiting state to come back in runnable state.
			//But it doesn't mean that the thread(which will come into Runnable state) will acquire the lock.
			//But it now needs and will be in search 
			//for lock
		}
	}

}
