package string;
import java.util.Scanner;
public class ConcateString {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.next();
		String s1 = scan.next();
		System.out.println(s.concat(s1));
	}

}
