import java.util.Scanner;
public class LeapYear {
	   public static void main(String[] args){
	   int y;
	   System.out.println("Enter an Year");
	   Scanner scan = new Scanner(System.in);
	   y= scan.nextInt();
       if(y%4==0)
       {
    	   if(y%100==0)
    	   {
    		   System.out.println("NO");
    	   }
    	   else
    	   {
    		   System.out.println("YES");
    	   }
       }   
	   else
	   {
		   System.out.println("NO");
	   }
	}
}
