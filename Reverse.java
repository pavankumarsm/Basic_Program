import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num,rev=0,rem;
		System.out.println("ENTER THE NUMBER");
		num = scan.nextInt();
		while(num!=0)
		{
			rem = num%10;
			rev = rev*10 + rem;
			num = num /10;
		}
		System.out.println(rev);
	}
}
