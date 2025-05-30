package string;
import java.util.Scanner;
public class DigitsSumConcate {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	//collct input String
	String s1 = scan.nextLine();
	
	//create String
	String t = "";
	
	//use loops 

	int sum = 0,n;
	for(int i=0;i<s1.length();i++)
	{
		char c = s1.charAt(i);
		if(Character.isDigit(c))
		{
			 n = Character.getNumericValue(c);
			 sum += n;
		}
		else
		{
			t = t + c;
		}
	}
	t = t + sum;
   System.out.println(t);
	}

}
