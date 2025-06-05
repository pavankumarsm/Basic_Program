import java.util.Scanner;

public class Psquare {
	static int anu(int s){
		int p = 4*s;
		return p;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		System.out.println(anu(s));
	}

}
