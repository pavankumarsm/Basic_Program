import java.util.Scanner;
public class Candies {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		int c[] = new int[n];
		c[0]=1;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>arr[i-1]){
				c[i] = c[i-1] + 1;
			}
			else if(arr[i-1]>=arr[i]){
				c[i]=1;
			}
		}
		
		for (int i = c.length-2; i >=0; i--) {
			if(arr[i]>arr[i+1]){
				if(c[i]<=c[i+1]){
					c[i]++;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
