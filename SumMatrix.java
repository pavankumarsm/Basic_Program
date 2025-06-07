import java.util.Scanner;
public class SumMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the dimension of MATRIX A and MATRIX B ");
		int n=scan.nextInt();
		int a[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		int b[][] = new int[n][n];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=scan.nextInt();
			}
		}
		int c[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]);
			}
		}
}
}
