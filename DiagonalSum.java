import java.util.Scanner;
public class DiagonalSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num of rows and coloumn");
		int n=scan.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				sum=sum+a[i][j];
			}
		}
		System.out.println(sum);
	}
}
