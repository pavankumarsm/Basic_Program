
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n,f=1;
	System.out.println("ENTER THE NUMBER");
	n = scan.nextInt();
	for(int i=n;i>0;i--)
	{
		f = f*i;
	}
    System.out.println(f);
	}

}
