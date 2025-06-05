package string;
import java.util.Scanner;
public class NumericCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if( s.charAt(i) >= '0' && s.charAt(i) <= '9' )
			{
				count++;
			}
		}
		System.out.println(count);
}

}