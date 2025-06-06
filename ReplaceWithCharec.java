package string;

import java.util.Scanner;
public class ReplaceWithCharec {
	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
		
		System.out.println("ENTER THE STRING");
		String s1 = s.nextLine();
		String s2 ="";
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			
			if( c >= 'A' && c <= 'Z')
			{
				s2 = s2 + '#';
			}
			else 
			{
				s2 = s2 + c;
			}

   	     }
		System.out.println(s2);
	}
}
