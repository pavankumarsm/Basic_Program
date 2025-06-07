package string;
import java.util.Scanner;
public class ToupperTolower {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER THE STRING");
		String s1 = s.next();
		String s2 ="";
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			
			if( c >= 'A' && c <= 'Z')
			{
				s2 = s2 + (char)(c + 32);
			}
			else if ( c >= 'a' && c <= 'z')
			{
				s2 = s2 + (char)(c - 32);
			}
			else
			{
				s2 = s2 + c;
			}
		}
		System.out.println(s2);
	}

}
