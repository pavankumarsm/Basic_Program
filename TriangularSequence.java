import java.util.Scanner;
public class TriangularSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k=0,count=1;
		for(int i=0;i<=n;i++)
		{
			k+=count;
			count++;
			System.out.print(k+" ");
		}
	}

}
