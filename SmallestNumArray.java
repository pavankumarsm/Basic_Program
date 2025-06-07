import java.util.Scanner;
public class SmallestNumArray {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ENTER THE NUMBERS");
    	int n = sc.nextInt();
    	int a[] = new int[n];
    	for(int i=0;i<a.length;i++){
    		a[i]=sc.nextInt();
    	}
    	int dif = a[0];
    	for(int i=0;i<a.length;i++){
        	if(a[i]<dif){
    	    	dif = a[i];
    			}
    }
    	System.out.println(dif);
    	
    		
}
}