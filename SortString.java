package string;
import java.util.Scanner;
public class SortString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.next();
		char a[] = s.toCharArray();
		
		char temp = 0;
    	for (int i = 0; i < a.length-1; i++)
    	{     
            for (int j = 0; j < a.length-i-1; j++)
            {     
               if(a[j] > a[j+1])
               {    
                   temp = a[j];    
                   a[j] = a[j+1];    
                   a[j+1] = temp;   
            	   
               }     
            }     
	    }
    	System.out.println(a);
	}

}
