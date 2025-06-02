import java.util.Scanner;
	public class LargestNumMatrix {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the num of rows ");
			int n=scan.nextInt();
			System.out.println("enter the num of rows ");
			int m=scan.nextInt();
			int a[][] = new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					a[i][j]=scan.nextInt();
				}
			}
			int large=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i][j]>large)
					large=a[i][j];
				}
			}
				
	System.out.println(large);
	
		}
	
	}
