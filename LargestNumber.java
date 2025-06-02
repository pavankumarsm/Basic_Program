import java.util.Scanner;
public class LargestNumber {
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
		int max = a[0];
		for(int i =0;i<a.length;i++)
		{
				if(a[i]>max)
				{
					max = a[i];
				}
		}
		System.out.println(max);
		//System.out.print(a[0]);
	}
}
