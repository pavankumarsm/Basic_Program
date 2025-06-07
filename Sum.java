 import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int n=123;
		Scanner scan = new Scanner(System.in);
		//System.out.println("ENTER THE NUMBER");
		//n = scan.nextInt();
		int a = n%10;
		int b = n/10;
		int c = b%10;
		int d = b/10;
		int sum = a+c+d;
		System.out.println(+sum);
		

	}

}
