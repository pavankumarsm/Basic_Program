package string;
import java.util.Scanner;
public class RemoveUpperCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("ENTER THE STRING");
			String s = scan.nextLine();
			String t ="";
			for(int i=0;i<s.length();i++)
			{
				char ch = s.charAt(i);
				if(ch >= 'A' && ch <= 'Z' )
				  {
				  }
				else
				{
					t = t + ch;
				}
			}
			System.out.println(t);
}


	}
