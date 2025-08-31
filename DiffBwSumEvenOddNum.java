import java.util.Scanner;
public class DiffBwSumEvenOddNum {
	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int n;
		    System.out.println("ENTER THE NUM");
		    n = scan.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<a.length;i++)
		    {
		    	a[i]=scan.nextInt();
		    }
		   int evenSum = 0;
		   int oddSum = 0;
		    for(int i=0;i<a.length;i++)
		    {
		    	if(a[i]%2==0)
			    {
			    	evenSum = a[i] + evenSum;
			    }
		    	else
		    	{
		    		oddSum = a[i] + oddSum;
		    	}
		    }
		    if(evenSum>oddSum)
		         System.out.println(evenSum-oddSum );
		    else if(evenSum<oddSum)
		    	System.out.println(-evenSum+oddSum );
		    else
		    	System.out.println(0);
		
	}

}

