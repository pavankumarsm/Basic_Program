import java.util.Scanner;
public class Sumarray {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n;
    System.out.println("ENTER THE NUM");
    n = scan.nextInt();
    int a[] = new int[n];
    for(int i=0;i<a.length;i++)
    {
    	a[i]=scan.nextInt();
    }
    int sum = 0;
    for(int i=0;i<a.length;i++)
    {
    	sum = sum + a[i];
    }
    System.out.println(sum);
   
 }
}
