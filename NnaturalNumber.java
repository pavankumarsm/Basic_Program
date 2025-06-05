import java.util.Scanner;
public class NnaturalNumber {
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER");
	 int n = scan.nextInt();
	 int s = n*(n+1)/2;
	 System.out.println("SUM OF THE N NATURAL NUMBERS = "+s);
	}
}
