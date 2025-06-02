import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1,n2,n3;
		//System.out.println("ENTER THE 1st NUMBER");
	    n1 = scan.nextInt();
		//System.out.println("ENTER THE 2nd NUMBER");
		n2 = scan.nextInt();
		//System.out.println("ENTER THE 3rd NUMBER");
		n3 = scan.nextInt();
        if(n1>n2 && n1>n3){
        	System.out.println(+n1);
        }
        else if(n2>n1&& n2>n3){
        	System.out.println(+n2);
        }
        else{
        	System.out.println(+n3);
        }
	}

}
