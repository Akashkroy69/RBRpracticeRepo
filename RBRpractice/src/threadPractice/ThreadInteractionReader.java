package threadPractice;

/*READ THIS ARTICLE ON INTERTHREAD COMMUNICATION IN JAVA : https://www.geeksforgeeks.org/inter-thread-communication-java*/
public class ThreadInteractionReader extends Thread {
	ThreadInteractionCalculator calculatorObj;

	public ThreadInteractionReader(ThreadInteractionCalculator calculatorObj) {
		this.calculatorObj = calculatorObj;
	}

	public void run() {

		synchronized (calculatorObj) {/* First it locks calculatorObj's by doing lock=1. */
			try {
				System.out.println("Waiting for the result.");
				
				if (calculatorObj.threadInteractionCalculatorExcecutedFirst==true) {
					System.out.println("No one is there to notify ThreadInteractionReader \nthread in wait state (as ThreadInteractionCalculator"
							+ "has run first and notify mathod is missed. Now thread will come back automatically in\n"
							+ "Runnable state.) "
							+ ". \nResult is coming in 10 seconds.\n\n\n\n");
					
				}

				calculatorObj.wait(10000);
				/*
				 * Reason of using wait(Long long) instead of wait(): If
				 * ThreadInteractionCalculator class runs first then later no one will be there
				 * to notify if it goes to wait state. so if that happens then it automatically
				 * comes to Runnable and later continue the left execution.
				 */

				/*
				 * ACCORDING TO JAVA DOCUMENTATION:
				 * 
				 * ---------------------------------------------------------------- void
				 * java.lang.Object.wait() throws InterruptedException
				 * --------------------------------------------------------------- it causes the
				 * current thread to wait until another thread invokes the
				 * java.lang.Object.notify() method or the java.lang.Object.notifyAll() method
				 * for this object. In other words, this method behaves exactly as if it simply
				 * performs the call wait(0).
				 * 
				 * The current thread must own this object's monitor. The thread releases
				 * ownership of this monitor and waits until another thread notifies threads
				 * waiting on this object's monitor to wake up either through a call to the
				 * notify method or the notifyAll method. The thread then waits until it can
				 * re-obtain ownership of the monitor and RESUMES execution.
				 * 
				 */

				/*
				 * objCalculator HERE RECORDS THAT THE THREAD RELATED TO ThreadInteractonReader
				 * class is calling wait. later this record will help to notify() this thread to
				 * resume its operation.
				 * 
				 * 
				 * It causes current thread to go into wait state until other thread invokes
				 * notify() or notifyAll() method for the current object
				 * 
				 * 
				 * 
				 */

			} catch (InterruptedException e) {

			}
		}
		/*
		 * here the current thread will release the lock from calculatorobj i.e, it
		 * makes lock=0
		 */
		System.out.println("Total sum is : " + calculatorObj.total);

	}

}
