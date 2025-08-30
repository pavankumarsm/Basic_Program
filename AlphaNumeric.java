package string;
import java.util.Scanner;
public class AlphaNumeric {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if( ch >= '0' && ch <= '9' || ch>= 'A' &&  ch <=  'z' )
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

