package string;
import java.util.Scanner;
public class ReversedWordsInString {
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		//collect the string
		String s1 = scan.nextLine();
		
		//String a[] = s1.toCharArray();
		
		//split and store into an array
		String a[] = s1.split(" ");
		
		//using loops 
		//logic
		String revString = "";
		for(int i=0;i<a.length;i++)
		{
		  String word = a[i];
		  String revWord = "";
		   for(int j=word.length()-1;j>=0;j--)
		   {
			   revWord = revWord + word.charAt(j);
		   }
		   revString = revString + revWord + " ";
		}
        System.out.println(revString);
	}

}
