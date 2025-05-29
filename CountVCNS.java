package string;
import java.util.Scanner;
public class CountVCNS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int vowels=0 , consonant=0 ,numeric = 0 ,special=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if( s.charAt(i) >= '0' && s.charAt(i) <= '9' )
			{
				numeric++;
			}
			else if(  ch>= 'A' &&  ch <= 'Z' || ch>= 'a' && ch <= 'z' )
			{
				if( ch == 'a'  || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u'|| ch == 'A'  || ch == 'E' || ch == 'I' || ch== 'O' || ch == 'U')
				{
					vowels++;
				}
    		    else
    		    {
    		    	consonant++;
    		    }
			}
			else if(ch == ' ')
			{
			}
			else
			{
				special++;
			}
		}
		System.out.println(+vowels+ " " +consonant+" " +numeric+" " +special);

	}

}
