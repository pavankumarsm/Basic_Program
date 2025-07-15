import java.util.Scanner;

public class Josephus {

		static int java(int n, int k)
		{
		if (n == 1)
		    return 1;
		else
		    
		    return (java(n - 1, k) + k-1) % n + 1;
		}
		 
		// Driver Program to test above function
		public static void main(String[] args)
		{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = 2;
		System.out.println( +java(n, k));
	
	}

}
