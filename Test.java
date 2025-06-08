
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s,p;
		System.out.println("ENTER THE SIDE OF AREA");
		s = scan.nextInt();
		Psquare st = new Psquare();
		
		System.out.println("PERIMETER OF THE CIRCLE = "+st.anu(s));

		
	}

}
