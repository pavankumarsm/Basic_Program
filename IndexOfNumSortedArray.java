import java.util.Scanner;
public class IndexOfNumSortedArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n;
	    System.out.println("ENTER THE NUM");
	    n = scan.nextInt();
	    long a[] = new long[n];
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=scan.nextInt();
	    } 
	    
	    System.out.println("ENTER THE NUM TO CHECK INDEX");
	    long index = scan.nextLong();
        
	    
	    long temp = 0;
	    for (int i = 0; i < a.length; i++)
	    {     
            for (int j = i+1; j < a.length; j++) 
            {     
               if(a[i] < a[j]) 
               {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
                   
               }     
            }     
        }    
        int count=0;
	    for(int i=0;i<a.length;i++)
	    {
	    	if(a[i]==index)
	    	{
	    		System.out.println(i);
	    		count++;
	    	}
	    	
	    }
	    if(count==0)
	    	System.out.println("print-1"); 
        }    	
	}


