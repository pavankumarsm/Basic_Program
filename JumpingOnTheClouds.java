import java.util.Scanner;
public class JumpingOnTheClouds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length-2; ) {
			if((arr[i+1]==0 && arr[i+2]==0 )|| (arr[i+1]!=0 && arr[i+2]==0) ){
				count++;
				i=i+2;
			}
			else if(arr[i+1]==0 && arr[i+2]!=0){
                count++;
                i++;
			}
			
		}
		System.out.println(count);
	}

}
