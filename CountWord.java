package string;
import java.util.Scanner;
public class CountWord {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("ENTER THE STRING");
			String s = scan.nextLine();
			int count=0;
			for(int i=0;i<s.length()-1;i++)
			{
			  if(s.charAt(i) == ' ')
			  {
				  if(s.charAt(i+1) == ' ')
				  {
					 
				  }
				  else
				  {
					  count++;
				  }
			  }
			}

			if( s.charAt( s.length()-1) == ' ')
			{
			 count++;
			// String w = "10";
		    }
			else
			{
				 System.out.println(count+1);
			}

			
	}
}
