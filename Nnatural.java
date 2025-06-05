import java.util.Scanner;
public class Nnatural {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("ENTER THE NUMBER");
	 int n = scan.nextInt();
	 //char count = 1;
	 int sum = 0;
	 for(int i=1;i<=n;i++){
		 sum = i+sum;
		 //count++;
	 }
	 System.out.println("SUM OF THE N NATURAL NUMBERS = "+sum);

	}

}
