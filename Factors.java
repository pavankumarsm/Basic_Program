import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n = scan.nextInt();
		for(int i =1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				
			}
			else
			{
				
			}
		}
	}
}
		


