package string;
import java.util.Scanner;
public class CountChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			//System.out.println(s.charAt(i));
			count++;
		}
		System.out.println(count);
		
	}

}
