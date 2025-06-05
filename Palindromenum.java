import java.util.Scanner;

public class Palindromenum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,rev=0,rem;
		System.out.println("ENTER THE NUMBER");
		num = scan.nextInt();
		int n=num;
		while(num!=0)
		{
			
			rem = num%10;
			rev = rev*10 + rem;
			num = num /10;
		}
		if(n==rev)
			System.out.println("YES");
		else
		    System.out.println("NO");
	}

}
