package string;
import java.util.Scanner;
public class RemoveConsonats {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
	    	if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
	    	{
			  if( ch == 'a'  || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u'|| ch == 'A'  || ch == 'E' || ch == 'I' || ch== 'O' || ch == 'U')
			  {
				  t = t+s.charAt(i);
			  }
			  else
			  {
			  }
	    	}
	    	else
	    	{
	    		  t = t+s.charAt(i);
	    	}
 		}
		System.out.println(t);
	}

}
