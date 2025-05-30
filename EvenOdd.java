import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("ENTER THE NUMBER");
        n=scan.nextInt();
        if(n%2==0)
          System.out.println("EVEN");
        else
          System.out.println("ODD");
      
	}

}
