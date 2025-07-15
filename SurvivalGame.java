import java.util.Scanner;
import java.util.*;
public class SurvivalGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	        int T=sc.nextInt();
	        int[] a=new int[T];
	        for(int i=0;i<a.length;i++){
	            a[i]=sc.nextInt();
	        }
	        int prd;
	        int count=0;
	        for(int i=0;i<a.length;i++){
	            prd=1;
	            for(int j=1;j<=a[i];j++){
	                prd*=j;
	            }
	            while((prd%10)==0){
	                count++;
	                prd=prd/10;
	            }
	            System.out.println(count);
	}
	}
}


