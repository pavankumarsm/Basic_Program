import java.util.Scanner;
public class ProductOfNumbers {
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
		int mul=1;
		for(int i =0;i<a.length;i++)
		{

					mul = a[i]*mul;
		}
		System.out.println(mul);
		//System.out.print(a[0]);
	}
}
