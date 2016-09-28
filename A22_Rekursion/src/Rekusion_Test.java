/**
 * Klasse welche 2 Rekursive Methoden besitzt
 * @author Dragana Sunaric
 * @version 10.03.2016
 */
public class Rekusion_Test {
	/**
	 * Ruft die Rekursiven Methoden fibonacci & factorial auf
	 * @param args
	 */
	public static void main(String []args){
		System.out.println(factorial(500));
		System.out.println(fibonacci(500));
	}
	/**
	 * Berechnet n factorial
	 * @param n
	 * @return n!
	 */
	public static long factorial(long n){
		try{
		if(n <= 0)return 1;
		return n*factorial(n-1);
		}catch(StackOverflowError e){
			System.out.println("Overflow :) ");
			return n;
		}catch(ArithmeticException e){
			System.out.println("zu groß für long :)");
			return n;
		}
	}
	
	/**
	 * Berechnet die n-te Fibonacci Zahl
	 * @param n
	 * @return n-te fibonacci zahl
	 */
	public static long fibonacci(long n){
		try{
		if(n <= 2)return 1;
		return fibonacci(n-1)+fibonacci(n-2);
		}catch(StackOverflowError e){
			System.out.println("Overflow :) ");
			return n;
		}catch(ArithmeticException e){
			System.out.println("zu groß für long :)");
			return n;
		}
	}
}