package string;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.next();
		String r = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(s.equals(r)==true)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}