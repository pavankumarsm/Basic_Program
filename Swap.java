import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n1,n2,c;
	//System.out.println("ENTER THE FIRST NUMBERS");
	n1=scan.nextInt();
	//System.out.println("ENTER THE FIRST NUMBERS");
	n2=scan.nextInt();
	System.out.println("Before Swapping");
	System.out.println(n1);
	System.out.println(n2);
	c=n1;
	n1=n2;
	n2=c;
	System.out.println("After Swapping");
	System.out.println(n1);
	System.out.println(n2);
	
	}
}
