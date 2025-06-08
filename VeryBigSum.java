import java.util.Scanner;
	class Demo
	{
	public long aVeryBigSum(int a[])
	 {
        long sum=0l;
        
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
	 	return sum;
      }
	}
	
	
	public class VeryBigSum {
	public static void main(String[] args){
		        Scanner scan = new Scanner(System.in);
		        //Complete the code
		        int n = scan.nextInt();
				
				int a[] = new int[n];
				long sum=0l;
				for(int i=0;i<n;i++)
				{
					a[i] = scan.nextInt();
					sum = sum + a[i];
				}
				//System.out.println(sum);
				Demo d = new Demo();
				System.out.println(d.aVeryBigSum(a));
	}
}
		  
