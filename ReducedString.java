package string;
import java.util.Scanner;
public class ReducedString {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String str = scan.next();
	String newString = "";

	for(int i=1;i<str.length();i++){
		char c = str.charAt(i);
		char d = str.charAt(i-1);
		if(c==d){
			str = str.substring(0, i-1) + str.substring(i+1);
		}
	}
	
	if(str.length()==0){
		System.out.println("Empty String");
	}else{
		System.out.println(str);
	}
	
	}

}