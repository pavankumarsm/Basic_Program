import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
				
				int a[]=new int[n];
				
				for(int i=0;i<a.length;i++)
				{
					a[i]=scan.nextInt();
				}
//				
				int c=n;
				int b[]=new int[n];
				for(int i=0;i<n;i++)
				{
					b[c-1]=a[i];
					c--;
					
				}
				for(int i=0;i<a.length;i++)
				{
					System.out.println(b[i]);
				}
//			int[] a1=  a;
//			
//				for(int i=a.length-1;i>=0;i--) {
//					System.out.print(a1[i]+" ");
//				}
//				if(a==a1) {
//					System.out.println("yes");
//				}else {
//					System.out.println("no");
//				}
				
	}

}
