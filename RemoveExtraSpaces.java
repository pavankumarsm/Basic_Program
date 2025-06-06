package string;
import java.util.Scanner;
public class RemoveExtraSpaces {
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
		
       //take string
		String s = scan.nextLine();
		
		System.out.println(s.replaceAll("\\s+", " "));
	
	}

}
