import java.util.*;
//import java.lang.Math;
public class CompoundIntrest {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		int p,r,t,n;
		System.out.println("ENTER THE PRINCIPAL AMOUNT  ");
		p=Scan.nextInt();
		System.out.println("ENTER THE ANNUAL INTREST ");
		r=Scan.nextInt();
		System.out.println("ENTER THE TIME PERIOD  ");
		t=Scan.nextInt();
		System.out.println("ENTER THE NUMBERS OF TIMES INTREST IS COMPOUNDED PER UNIT T ");
		n=Scan.nextInt();
		//calcutating the compound interest
		double c = p * Math.pow(1+(r/n),(n*t)) - p;
		System.out.println(c);
	}

}
