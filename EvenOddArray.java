import java.util.Scanner;
public class EvenOddArray {
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
		int even = 0, odd=0;
		for(int i=0;i<a.length;i++)
		{
			 if(a[i]%2==0)
			 {
				 even++;
			 }
			 else
			 {
				 odd++;
			 }	 
		}
		System.out.println(even);
		
		System.out.println(odd);
		

}
}

