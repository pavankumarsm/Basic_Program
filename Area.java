import java.util.Scanner;
public class Area {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int r;
		float pi = 3.142f , a;
		System.out.println("ENTER THE RADIUS OF CIRCLE");
		r = scan.nextInt();
		a = pi*r*r;
		System.out.println("AREA OF THE CIRCLE = "+a);
	}

}
