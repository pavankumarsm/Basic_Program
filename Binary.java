import java.util.Scanner;
public class Binary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("ENTER THE NUMBER");
		n = scan.nextInt();
		System.out.println(Integer.toBinaryString(n)); 
	}

}
