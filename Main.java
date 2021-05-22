package red;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
    	Scanner in = new Scanner(System.in);
    	System.out.print("N = ");
    	int n = in.nextInt(); // Number of opening and closing brackets
    	if (n > 0) { // Check N > 0
    	int sum = getFactorial(2 * n) / (getFactorial(n) * getFactorial(n + 1)); // Finding through binomial coefficients
    	System.out.println(sum);
    	}
    }
    
    public static int getFactorial(int f) { // Method for finding the factorial of a number
    	  int result = 1;
    	  for (int i = 1; i <= f; i++) {
    	     result = result * i;
    	  }
    	  return result;
    	}

}
