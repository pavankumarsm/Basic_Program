package string;
import java.util.Scanner;
public class SubString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.next();
		for(int i=0;i<s.length()-2;i++)
		{
			System.out.println(s.substring(i,i+3));	
		}

		
			
		
	}

}
