package string;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.nextLine();
		String r = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			r=r+s.charAt(i);
		}
		System.out.println(r);
	}

}
