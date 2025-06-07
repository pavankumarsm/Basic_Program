import java.util.Scanner;
public class Square {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s;
		System.out.println("ENTER THE SIDE OF AREA");
		s = scan.nextInt();
		int a = s*s;
		System.out.println("AREA OF THE SQUARE = "+a);

	}

}
