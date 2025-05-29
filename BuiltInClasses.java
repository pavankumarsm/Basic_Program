package string;
import java.util.Scanner;
public class BuiltInClasses {
	
	static String toUpperCase(String s){
		
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				arr[i] =   (char)(s.charAt(i) -32);
			}
		}
		return new String(arr);
	}
	
	static String toLowerCase(String s){
		
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>='A' && arr[i]<='Z')
			{
				arr[i] = (char) (arr[i] + 32);
			}else{
				
			}
		}
		return new String(arr);
	}
	
	static int indexOf(String s,String c){
		
		for(int i=0;i<s.length();i++){
			 if(c.charAt(0)==s.charAt(i)){
				 return i;
			 }
		}
		return -1;
	}
	
	static int lastIndexOf(String s,String c){
		
		for(int i=s.length()-1;i>=0;i--){
			if(c.charAt(0)==s.charAt(i)){
				return i;
			}
		}
		return -1;
		
	}
	
	static String trim(String s){
		int startIndex = 0, endIndex = 0;
		String t = "";
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!= ' '){
				startIndex = i;
				break;
			}
		}
		
		for(int i=s.length()-1;i>=0;i--){
			if(s.charAt(i)!= ' '){
				endIndex = i;
				break;
			}
		}
		
		for(int i=startIndex;i<=endIndex;i++){
			t = t + s.charAt(i);
		}
		return t;
	}
	
	static char[] toCharArray(String s){
		char[] arr = new char[s.length()];
		
		for(int i=0;i<s.length();i++){
			arr[i] = s.charAt(i);
		}
		return arr;		
	}
	
	static boolean equals(String s,String s1){
		
		if(s.length() != s1.length()){
			return false;
		}
		
		for(int i=0;i<=s.length();i++){
			if(s.charAt(i) != s1.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	static boolean startsWith(String s, String s1){
		
		int count = 0;
		if(s.length()<s1.length()){
			return false;
		}
		
		for(int i=0;i<s1.length();i++){
			if(s.charAt(i) != s1.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	
	static boolean endsWith(String s,String s1){
		int j = 0;
		if(s.length()<s1.length()){
			return false;
		}
		
		for(int i=s.length()-s1.length();i<s.length();i++){
			if(s.charAt(i) != s1.charAt(j)){
				return false;
			}
			j++;
		}
		return true;
	}
	
	static boolean contains(String s,String s1){
		
		int count = 0;
		if(s1.length() > s.length()){
			return false;
		}
		
		for (int i = 0; i < s.length() && count < s1.length(); i++) {
			if(s.charAt(i)==s1.charAt(count)){
				count++;
			}
			else{
				count = 0;
			}
		}
		if(count == s1.length()){
			return true;
		}
		return false;
	}
	
	static String replace(String s,char oc,char nc){
		
		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == oc){
				arr[i] = nc;
			}
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String");
		String s = scan.nextLine();
		
		System.out.println("enter the next string");
		String s1 = scan.nextLine();
		/*
		System.out.println("enter the charecter to be replaced");
		char oc = scan.next().charAt(0);
		System.out.println("enter the new charecter to be replaced");
		char nc = scan.next().charAt(0);
		
	  System.out.println(toUpperCase(s));
		*/
	 //System.out.println(toLowerCase(s));
		
     //System.out.println("enter the char");
	 //String c = scan.nextLine();
		
	 //System.out.println(indexOf(s,c));
	    
    // System.out.println(lastIndexOf(s,c));
		
	//System.out.println(trim(s));
		
	/*char[] a = toCharArray(s);
	 for(int i=0;i<a.length;i++){
		 System.out.println(a[i]);
	 }*/
	 
	//System.out.println(equals(s,s1));
		
	//System.out.println(startsWith(s,s1));
		
	// System.out.println(endsWith(s,s1));
		
	 System.out.println(contains(s,s1));
		//System.out.println(replace(s,oc,nc));
	}
}
