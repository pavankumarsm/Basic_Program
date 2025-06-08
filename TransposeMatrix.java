import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
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
				b[j][i]=a[i][j];
				
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
}
}
