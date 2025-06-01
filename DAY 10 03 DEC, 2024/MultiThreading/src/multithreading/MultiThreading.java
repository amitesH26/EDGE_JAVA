
package multithreading;

import java.util.Scanner;
// -> lamda expression, using runnable interface
// Java code for thread creation by extending
// the Thread class
/*class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
*/

//class Multithread extends Thread{}
// class my thread implements Runnable{}

/*class MultiThread extends Thread{
    void run(double start, double end){
        int k=0;
        for(double i = start; i<= end; i++){
            for(double j= 2; j<=end; j++){
                if(start % j == 0){
                    k=1;
                }
                if(k==0){
                    System.out.println(start + " Is Prime");
                }
            }
        }
    }
}

// Main Class
public class MultiThreading {
	public static void main(String[] args)
	{
            Scanner scan = new Scanner(System.in);
            MultiThread m1 = new MultiThread();
/*		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
		}
*/


/*class PrimeCheckerThread extends Thread {
    private int start;
    private int end;
    private int threadId;

    // Constructor to set the range for each thread and the thread ID
    PrimeCheckerThread(int start, int end, int threadId) {
        this.start = start;
        this.end = end;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        // Print which thread is processing this range
        System.out.println("Thread " + threadId + " is checking numbers from " + start + " to " + end);
        
        // Check each number in the range [start, end]
        for (int number = start; number <= end; number++) {
            int k = 0;
            
            // Check if the number is prime
            for (int j = 2; j <= number / 2; j++) {
                if (number % j == 0) {
                    k = 1;
                    break;
                }
            }

            // If k == 0, it means the number is prime
            if (k == 0 && number > 1) {
                System.out.println("Thread " + threadId + ": " + number + " is Prime");
            }
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Asking user for the range of numbers to check for primality
        System.out.print("Enter the range to check for primes (start end): ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        // Total number of threads
        int numThreads = 10;
        // Divide the range into parts for each thread
        int rangePerThread = (end - start + 1) / numThreads;

        // Array to hold threads
        PrimeCheckerThread[] threads = new PrimeCheckerThread[numThreads];

        // Create and start threads for each chunk
        for (int i = 0; i < numThreads; i++) {
            int chunkStart = start + i * rangePerThread;
            int chunkEnd = (i == numThreads - 1) ? end : (chunkStart + rangePerThread - 1);
            threads[i] = new PrimeCheckerThread(chunkStart, chunkEnd, i + 1);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (PrimeCheckerThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scan.close();
    }
}*/
class IsEven implements Runnable{
    int num;
    IsEven(int num){
        this.num = num;
    }
    @Override
    public void run(){
        System.out.println(num + " Thread is running");
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
public class MultiThreading{
    public static void main(String[] Args){
        for(int i =0 ; i<10;i++){
        Thread t1 = new Thread();
        t1.start();
        }
    }
}
