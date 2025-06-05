import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,count=0;
		System.out.println("ENTER THE NUMBER TO BE CHECK");
		n=scan.nextInt();
		int m = n/2;
		if(n==0 || n==1)
		{
			System.out.println("NO");
		}
		else
		{  
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println("NO");
					count = 1;
	                break; 
				}
			}
		}
		if(count == 0)
			{
				System.out.println("YES");
			}
		}
	}


