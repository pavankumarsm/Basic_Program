import java.util.Scanner;
public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("ENTER THE NUMBERS");
    	int n1 = sc.nextInt();
    	int n2 = sc.nextInt();
    	
    	int a[] = new int[n1];
    	for(int i=0;i<a.length;i++)
    	{
    		a[i]=sc.nextInt();
    	}
    	
    	int b[] = new int[n2];
    	for(int i=0;i<b.length;i++)
    	{
    		b[i]=sc.nextInt();
    	}
    	
    	int n3 =n1+n2;
    	
    	int c[] = new int[n3];
    	for(int i=0;i<a.length;i++)
    	{
    		c[i]=a[i];
    	}
    	
    	for(int i=0;i<b.length;i++){
    		c[n1+i]=b[i];
    	}
    	
    	for(int i=0;i<c.length;i++)
    	{
    		System.out.println(c[i]);
    	}
    	
    	int temp = 0;
    	for (int i = 0; i < c.length; i++)
    	{     
            for (int j = i+1; j < c.length; j++) 
            {     
               if(c[i]< c[j]) 
               {    
                   temp = c[i];    
                   c[i] = c[j];    
                   c[j] = temp;    
               }     
            }     
	   }
    	for(int i=0;i<c.length;i++)
    	{
    		System.out.println(c[i]);
    	}
    } 	
}


