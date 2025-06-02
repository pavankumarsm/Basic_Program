import java.util.Scanner;

	public class Lcm {
		public static void main (String[] args){
			 Scanner scan = new Scanner(System.in);
			 //System.out.println("ENTER THE 1st NUMBER");
			 int n,m;
			 n = scan.nextInt();
			 //System.out.println("ENTER THE 2nd NUMBER");
			  m = scan.nextInt();
			 int lcm;
			 lcm = (n > m) ? n : m;
			 while(true) {
			 if( lcm % n == 0 && lcm % m == 0 ) {
			 System.out.println(lcm);
			 break;
			 }
			 ++lcm;
		  }
		}
	}


