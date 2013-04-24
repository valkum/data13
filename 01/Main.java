/**
 * Datenstrukturen und Algorithmen (SS2013)
 * Assignment 1 
 */

/**
 * Insert your names and matriculation numbers here:
 * Kim Brose (322935)
 * Rudolf Floren (318099)
 * Fabian Unterstell (319303)
 */

public class Main {

	public static void main(String[] args) {
		
		Fibonacci fibonacciObj = new Fibonacci();
		int fib;
		long startTime;
		double computationTime;
		
		for(int i=0; i<=40; ++i) {
			startTime = System.nanoTime();
			fib = fibonacciObj.fibonacciRecursive(i);
			computationTime = (double)(System.nanoTime()-startTime)/1000000000.0;
			System.out.printf("FibonacciRecursive(%d) = %d (Computation took %.16f seconds)\n",i,fib,computationTime);
		}
		
		for(int i=0; i<=40; ++i) {
			startTime = System.nanoTime();
			fib = fibonacciObj.fibonacciIterative(i);
			computationTime = (double)(System.nanoTime()-startTime)/1000000000.0;
			System.out.printf("FibonacciIterative(%d) = %d (Computation took %.16f seconds)\n",i,fib,computationTime);
		}

	}

}
