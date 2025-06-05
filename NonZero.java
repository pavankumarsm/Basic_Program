import java.util.Scanner;
public class NonZero {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF ELEMENTS ");
		int n =Scan.nextInt();
		int a[] = new int[n];
		System.out.println("ENTER THE ELEMENTS ");
		for(int i=0;i<a.length;i++)
		{
			 a[i] = Scan.nextInt();
		}
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			 if(a[i]>0 || a[i]<0)
			 {
				 count++;
			 }
		}
		System.out.println(count);

}
}


