package string;
import java.util.Scanner;
public class UpperCase {
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("ENTER THE STRING");
			String s = scan.nextLine();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' )
				{
					count++;
				}
			}
			System.out.println(count);
	}

}
