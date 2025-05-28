import java.util.Scanner;
public class Copy {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		
		int b[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		for(int i=0;i<a.length;i++)
		{

       System.out.println(b[i]);

		}
	}
	}