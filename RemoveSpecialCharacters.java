package string;
import java.util.Iterator;
import java.util.Scanner;
public class RemoveSpecialCharacters {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE STRING");
		String s = scan.nextLine();
	String t ="";
	for(int i=0;i<s.length();i++)
		{
		char ch = s.charAt(i);
			if( ch >= '0' && ch <= '9' || ch>= 'A' &&  ch <= 'Z' || ch>= 'a' && ch <= 'z' )
			{
				t = t + ch;
			}
		}
		System.out.println(t);
	}


	}

 