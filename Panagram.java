package string;
import java.util.Scanner;
public class Panagram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//take the input string
		String str = scan.nextLine();
		
		//create an array having the size of alphabets
	    boolean[] alphaList = new boolean[26];
	    
	    //intialize the value
	    int index = 0,flag=1;
	   
	    //logic here if the charAt i th poistion is b then 
	    //the ASCI value of b = 66
	    //index = 66 - 65 = 1
	    //at alphalist[index] = true
	    for (int i = 0; i < str.length(); i++)
	    {
	      if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
	      {
	          index = str.charAt(i) - 'A';
	      }
	      else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
	      {
	            index = str.charAt(i) - 'a';
	      }
	      
	      alphaList[index] = true;
	   }
	    
	    //if all the 26th array values be true then it is panagram
	   for (int i = 0; i <= 25; i++) {
	      if (alphaList[i] == false)
	      flag = 0;
	   }
	   
	   if(flag == 1)
	      System.out.print("pangram");
	   else
	      System.out.print("not pangram");
	}

}
