import java.util.Scanner;
public class ChoclateFest {
	
	
	static int chocolateFeast(int n, int c, int m) {
		
	   int choco = n/c;
	   int wrap = choco;
	   int newChoco = 0;
	   
	   while(wrap >= m){
		   
		   newChoco = wrap/m;
		   choco += newChoco;
		   wrap = wrap%m + newChoco;
	   }
	   return choco;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int c = scan.nextInt();
		int m = scan.nextInt();
		
		System.out.println(chocolateFeast(n,c,m));
		
	}

}


/* logic
 
 choco = 5
 wrap = 5
 newChoco = 0
  
  wrap >= m
  calculate new choc after exchange  -----newChoc =  choc/m 
  update total choc had   ---  choc += newChoc
  update wrap count  --- wrap = wrap%m + newChoc
  
  
  
  
*/   
