import java.util.Scanner;
public class SquareArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
			b[i] = a[i]*a[i];
			System.out.println(b[i]);
		}
	}

}
