package string;
import java.util.Scanner;
public class FrequencyOfSubStr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//taking the main string
		String s = scan.nextLine();
		
		//taking the substring
		String s1 = scan.next();
		
		int count=0;

		//using loop
	   for(int i=0;i<=s.length()-s1.length();i++)
	   {
		   if((s.substring(i, i+s1.length())).equalsIgnoreCase(s1))
		   {
			   count++;
		   }
		  
	   }
     System.out.println(count);
		 
	}

}