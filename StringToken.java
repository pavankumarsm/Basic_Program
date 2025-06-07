package string;
import java.util.StringTokenizer;
public class StringToken {
	public static void main(String[] args) {
		// 1
		StringTokenizer s1 = new StringTokenizer("stay, at, home, .");
		System.out.println(s1.nextToken(","));
		
		// 2
		StringTokenizer s2 = new StringTokenizer("abc,def,ghi", ",");
		System.out.println(s2.nextToken());
		
		//3
		StringTokenizer s3 = new StringTokenizer("abc def+ghi", "+");
		System.out.println(s3.nextToken());
		System.out.println(s3.nextToken());
		
		//4
				StringTokenizer s4 = new StringTokenizer("core java");
				{
					while(s4.hasMoreTokens()==true)
						System.out.println(s4.nextToken());
				}
				
	}
}
