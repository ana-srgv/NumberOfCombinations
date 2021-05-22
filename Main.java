package red;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("N = ");
    	int n = in.nextInt();
    	if (n > 0) {
    	int sum = getFactorial(2 * n) / (getFactorial(n) * getFactorial(n + 1));
    	System.out.println(sum);
    	}
    }
    
    public static int getFactorial(int f) {
    	  int result = 1;
    	  for (int i = 1; i <= f; i++) {
    	     result = result * i;
    	  }
    	  return result;
    	}

}