import java.util.*;
public class gcd {
	public static void main (String[] args){
	Scanner scan = new Scanner(System.in);
	int n,m; 
	n = scan.nextInt();
	m = scan.nextInt();
	int gcd =0;  
	for(int i = 1; i <= n && i <= m; i++)  
	{  
	if(n%i==0 && m%i==0)
	gcd = i;  
	}  

	System.out.println(gcd);  
	}

}
