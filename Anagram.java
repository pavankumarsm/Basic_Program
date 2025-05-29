package string;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		
		if(s1.length() != s2.length())
		{
			System.out.println("not anagram");
		}
		else
		{
			char a[] = s1.toLowerCase().toCharArray();
			char b[] = s2.toLowerCase().toCharArray();
			
		    Arrays.sort(a);
			Arrays.sort(b);
			 
			if(Arrays.equals(a, b))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		
	}
		
	}
}
