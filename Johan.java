import java.util.Scanner;
public class Johan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i] = scan.nextInt();
		}
		int mark=0,john=0;
		for(int i=0;i<3;i++)
		{
			if(a[i]>b[i])
			{
				mark++;
			}
			else if(a[i] < b[i])
			{
				john++;
			}
			else
			{
				
			}
		}
		System.out.println(mark+" "+john);
	}

}
