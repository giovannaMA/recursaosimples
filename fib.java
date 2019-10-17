import java.util.Scanner;

public class Fibonacci {
	
	public static int fib (int element) {
		
		int result = 0;
		
		if (element == 0) {
			result = 0;
		} else if (element == 1) {
			result = 1;
		} else {
			result = fib(element - 1) + fib(element - 2);
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int element = in.nextInt();
		
		System.out.println(fib(element));

	}

}
