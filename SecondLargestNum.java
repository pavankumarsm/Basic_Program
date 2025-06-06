import java.util.Scanner;
public class SecondLargestNum {
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
	    long temp = 0;
	    for (int i = 0; i < a.length-1; i++)
	    {     
            for (int j = 0; j < a.length-i-1; j++) 
            {     
               if(a[j] < a[j+1]) 
               {    
                   temp = a[j];    
                   a[j] = a[j+1];    
                   a[j+1] = temp;    
               }     
            }     
        }    
        System.out.println(a[1]);  

        }    	
	}


