import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r;
		float pi = 3.142f , p;
		System.out.println("ENTER THE RADIUS OF CIRCLE");
		r = scan.nextInt();
		p = pi*(2*r);
		System.out.println("PERIMETER OF THE CIRCLE = "+p);

	}

}
