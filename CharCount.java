package string;
import java.util.Scanner;
public class CharCount {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	// collect the string
	String s = scan.nextLine();
	
	// string to array
	char s1[] = s.toCharArray();
	
	// create frequency array
	int fre[] = new int[s.length()];
	
	//using loop check the frequency logic is
	for(int i=0;i<s1.length;i++)
	{  
		fre[i]=1;
		for(int j=i+1;j<s1.length;j++)
		{
			if(s1[i]==s1[j])
			{
				fre[i]++;
				//avoid printing visited char
				s1[j]='0';
			}
		}
	}
	
	
	//display the frequency charecter
	for(int i=0;i<s1.length;i++)
	{
		if(s1[i] != ' ' && s1[i] != '0')
		{
			System.out.println(s1[i]+ "-"+fre[i]);
		}
	}
	
	}

}
