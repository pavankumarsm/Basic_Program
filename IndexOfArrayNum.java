
import java.util.Scanner;
public class IndexOfArrayNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		 
		int small=a[0],in=0;
		for(int i=0;i<a.length;i++){
		if(a[i]<small)
		 {
			small=a[i];
	        in = i;
		 }
		}
		System.out.println(in);
	}
}
