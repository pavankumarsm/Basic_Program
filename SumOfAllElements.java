import java.util.Scanner;
public class SumOfAllElements {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS ");
		int n =Scan.nextInt();
		int a[] = new int[n];
		System.out.print("ENTER THE ELEMENTS ");
		for(int i=0;i<a.length;i++)
		{
			 a[i] = Scan.nextInt();
		} 
		int sum=0;
		for(int i =0;i<a.length;i++)
		{

					sum = a[i]+sum;
		}
		System.out.println(sum);
		//System.out.print(a[0]);
	}
}
