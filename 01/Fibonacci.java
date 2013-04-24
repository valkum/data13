/**
 * @class Fibonacci
 */
/**
 * Kim Brose (322935)
 * Rudolf Floren (318099)
 * Fabian Unterstell (319303)
 */
public class Fibonacci {
	public int fibonacciRecursive(int i) {
		/**
		 * Insert your code here!
	     */
		/**
		 * Angegebene rekursive Lösung der Fibonacci-Folge als Java-Code:
		 * Bei Eingabe 0 oder 1 wird 0 bzw 1 zurückgegeben.
		 * Sonst wird die Vorletzte Zahl + die letzte Zahl zurück gegeben.
		 */
		if(i == 0) return 0;
		else if(i == 1) return 1;
		else if (i >= 2) return fibonacciRecursive(i-2) + fibonacciRecursive(i-1);
		/**
		 * End of your Code!
	     */
        return -1;
	}
	public int fibonacciIterative(int i) {
		/**
		 * Insert your code here!
	     */
		/**
		 * Iterative Lösung:
		 * Wenn Eingabe 0 oder 1 gib 0 bzw 1 zurück.
		 * Sonst:
		 * Basiswerte initialisieren.
		 * Dann bis zur Eingabe iterieren und die temp. Zahlen addieren.
		 * Anschließend zurückgeben.
		 */
		if(i == 0) return 0;
		else if(i == 1) return 1;
		else if (i >= 2) {
		int fj2 = 0;
		int fj1 = 1;
		int fj0 = 0;
		for(int j = 1; j < i; j++) {
			fj0 = fj2 + fj1;
			fj2 = fj1;
			fj1 = fj0;
		}
        return fj0;
		}
		/**
		 * End of your Code!
	     */
        return -1;
	}
}
