import java.util.Scanner;
public class Perfect {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,s=0;
		//System.out.println("enter the number");
		n = scan.nextInt();
		for(int i =1;i<n;i++)
		{
			if(n%i==0)
			{
				//System.out.println(i);
				s=s+i;
			}
			else
			{
				
			}
		}
		if(s==n)
		{
			System.out.println("YES");
		}
		else
		{
		   System.out.println("NO");
		} 
		
	}
}